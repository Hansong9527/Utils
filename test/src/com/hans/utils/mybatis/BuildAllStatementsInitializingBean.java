package com.hans.utils.mybatis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.InitializingBean;

/**
 * 在系统启动时，build所有的sql语句，解决mybatis在高并发请求下报的异常：
 * 
 * ERROR [com.navinfo.tsp.core.server.AbstractTspServer] Unknown Error
	org.mybatis.spring.MyBatisSystemException: nested exception is org.apache.ibatis.exceptions.PersistenceException: 
	### Error querying database.  Cause: java.lang.IllegalArgumentException: Mapped Statements collection already contains value for com.navinfo.lemon.bi.login.LoginRoute.routeLogin
	### The error may exist in file [/usr/local/apache-tomcat-7.0.37/webapps/tsp/WEB-INF/classes/com/navinfo/lemon/bi/login/LoginRouteFunc.xml]
	### Cause: java.lang.IllegalArgumentException: Mapped Statements collection already contains value for com.navinfo.lemon.bi.login.LoginRoute.routeLogin
	at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:73)
	at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:346)
	at com.sun.proxy.$Proxy19.selectOne(Unknown Source)
	at org.mybatis.spring.SqlSessionTemplate.selectOne(SqlSessionTemplate.java:154)
	at com.navinfo.lemon.bi.login.LoginRouteFunc.verifyIdentity(LoginRouteFunc.java:120)
	at com.navinfo.lemon.bi.login.LoginRouteFunc.execute(LoginRouteFunc.java:63)
	at sun.reflect.GeneratedMethodAccessor39.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:317)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:183)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:150)
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:110)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:172)
	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:204)
	at com.sun.proxy.$Proxy20.execute(Unknown Source)
	at su
 * 
 * @author gem
 *
 */
public class BuildAllStatementsInitializingBean implements InitializingBean{
	
	private static final Log LOG = LogFactory.getLog(BuildAllStatementsInitializingBean.class);
	private SqlSession sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if(LOG.isDebugEnabled()){
			LOG.debug("mybatis start build all statements");
		}
		this.getSqlSession().getConfiguration().buildAllStatements();
		if(LOG.isDebugEnabled()){
			LOG.debug("mybatis build all statements success.");
		}
	}

}
