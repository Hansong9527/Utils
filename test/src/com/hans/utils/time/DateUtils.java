package com.hans.utils.time;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 *
 */
public class DateUtils {
	
	private static final String defaultFormat = "yyyyMMddHHmmss";
	private static final String defaultFormatWithMilis = "yyyyMMddHHmmssSSS";
	
	
	/**
	 * 获取当前时间的字符串形式 毫秒级
	 * @return
	 */
	public static String getCurrentTimestampWithMilis(){
		return formatDate(new Date(),defaultFormatWithMilis);
	}	
	
	/**
	 * 获取当前时间的字符串形式
	 * @return
	 */
	public static String getCurrentTimestamp(){
		return formatDate(new Date());
	}
	
	/**
	 * 格式化日期
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date){
		DateFormat dateFormat = new SimpleDateFormat(defaultFormat);
		String time = dateFormat.format(date);
		return time;
	}
	
	/**
	 * 格式化日期
	 * @param date
	 * @param type
	 * @return
	 */
	public static String formatDate(Date date, String type){
		DateFormat dateFormat = new SimpleDateFormat(type);
		String time = dateFormat.format(date);
		return time;
	}
	
	/**
	 * 字符串转换成日期(Date)，字符串格式为‘yyyyMMddHHmmss’ 或 ‘yyyyMMddHHmmssSSS’
	 * @param date
	 * @return
	 */
	public static Date parseDateTime(String date) {
		if (date == null || date.length() == 0)
			return null;
		if (date.length() == 14) {
			return parse(date, defaultFormat);
		} else if (date.length() == 17) {
			return parse(date, defaultFormatWithMilis);
		}
		return null;
	}
	
	/**
	 * 获取前一天的日期
	 * @param date
	 * @return
	 */
	public static Date getDayBefore(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		date = calendar.getTime();
		return date;
	}
	
	/**
	 * 字符串转换成日期，字符串格式同date类型
	 * @param date
	 * @param type
	 * @return
	 */
	public static Date parse(String date, String type) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将yyyyMMddHHmmss格式的日期增加秒数
	 * @param yyyyMMddHHmmssDate
	 * @param second
	 * @return
	 */
	public static String addSeconds(String yyyyMMddHHmmssDate, int second){
		Date d = DateUtils.parseDateTime(yyyyMMddHHmmssDate);
		Date d2 = org.apache.commons.lang.time.DateUtils.addSeconds(d, second);
		String d3 = DateUtils.formatDate(d2);
		return d3;
	}
	/**
	 * 字符串转化为Timestamp
	 * @param timestampStr 要转化的字符串
	 * @param format 格式
	 * @return Timestamp
	 */
	public static Timestamp stringToTimestamp(String timestampStr, String format) {
		if (timestampStr == null || timestampStr.trim().equals("")) {
			return null;
		}
		if (null == format || "".equals(format)) {
			format = defaultFormat;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Date date = null;
		try {
	        date = dateFormat.parse(timestampStr);
        } catch (ParseException e) {
	        e.printStackTrace();
        }
		return new Timestamp(date.getTime());
	}
	
	/**
	 * Timestamp 转化为字符串
	 * @param timestamp 要转化Timestamp
	 * @param format 格式
	 * @return String
	 */
	public static String timestamptoString(Timestamp timestamp, String format) {
		if (timestamp == null) {
			return null;
		}
		if (null == format) {
			format = defaultFormat;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(timestamp);
	}
	
	
	
	
	
	
	/**
	 * 统一日期出口，暂定取服务器时间
	 * @return
	 */
	public static Date getSysdate()
	{
		return new Date();
	}
	public static Timestamp getSysTime()
	{
		String mDateTime = MessageFormat.format("{0,date,yyyy-MM-dd HH:mm:ss}", new Object[] { getSysdate() });
		return Timestamp.valueOf(mDateTime);
	}
	
	/**
	 * 
	 * 当前时间加上指定秒数
	 * 
	 * @param lifeTime
	 * @return Timestamp
	 * @author 黄朝斌
	 */
	public static Timestamp getAddSeconds(String lifeTime) {
	    long addSeconds;
	    addSeconds = Long.parseLong(lifeTime);
	    return new Timestamp(new Date().getTime() + addSeconds * 1000);
	}
	
    /**
     * 
     * 获取当前系统时间
     * 
     * @return Timestamp
     * @author 黄朝斌
     */
    public static Timestamp getCurrentTimestamp2() {
        return new Timestamp(new Date().getTime());
    }

	/**
	 * 将日期增加N天
	 * @param date
	 * @param type
	 * @param i
	 * @return
	 */
	public static Date getdateAdded(Date date, int type, int i)
	{
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(type, i);
		return c.getTime();
	}

	/**
	 * 格式化日期，格式为“yyyy-MM-dd HH:mm:ss”
	 * @param date
	 * @return
	 */
	public static String format(Date date)
	{
		return format(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 格式化日期，格式自定义
	 * @param date
	 * @param type
	 * @return
	 */
	public static String format(Date date, String type)
	{
		if (date == null)
		{
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.format(date);
	}

	public static String getFirstDayOfMonth()
	{
		return getFirstDayOfMonth(getSysdate());
	}

	public static String getFirstDayOfMonth(Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String theday = sdf.format(date.getTime());
		String[] thedays = theday.split("-");
		return thedays[0] + "-" + thedays[1] + "-01";
	}

	public static String getLastDayOfMonth()
	{
		return getLastDayOfMonth(getSysdate());
	}

	public static String getLastDayOfMonth(Date date)
	{
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int max = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String theday = sdf.format(date.getTime());
		String[] thedays = theday.split("-");
		return thedays[0] + "-" + thedays[1] + (max >= 10 ? "-" + max : "-0" + max);
	}

	/**
	 * 取得当前时间的周一
	 * @return
	 */
	public static String getFirstDayOfWeek()
	{
		return getFirstDayOfWeek(getSysdate());
	}

	/**
	 * 取得制定日期的周一
	 * @param date
	 * @return
	 */
	public static String getFirstDayOfWeek(Date date)
	{
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()); // Monday
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(c.getTime());
	}

	/**
	 * 字符串转换成日期，字符串格式默认‘yyyy-MM-dd’
	 * @param date
	 * @return
	 */
	public static Date parse(String date)
	{
		return parse(date, "yyyy-MM-dd");
	}

	/**
	 * 字符串转换成日期(Date)，字符串格式默认‘yyyy-MM-dd HH:mm:ss’
	 * @param date
	 * @return
	 */
	public static Date parseDateTime2(String date)
	{
		return parse(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 字符串转换成日期(Timestamp)，字符串格式默认‘yyyy-MM-dd HH:mm:ss’
	 * @param date
	 * @return
	 */
	public static Timestamp parseTime(String date)
	{
		String mDateTime = MessageFormat.format("{0,date,yyyy-MM-dd HH:mm:ss}", new Object[] { parseDateTime2(date) });
		return Timestamp.valueOf(mDateTime);
	}

	/**
	 * 日期转换成字符串(Timestamp)，字符串格式默认‘yyyy-MM-dd HH:mm:ss’
	 * @param date
	 * @return
	 */
	public static String formatterTime(Timestamp data)
	{
		String str = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (data != null)
			str = df.format(data);
		return str;
	}

	/**
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
//		String s = "2012/8/02 08:2";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
//		System.out.println(format(sdf.parse(s)));
		getSysDateNoMillis();
		System.out.println(addSeconds("20141102111111", 3));
	}

	/**
	* 根据日期获得星期
	* @param date
	* @return
	*/
	public static String getWeekFromDate(Date date)
	{
		String[] weekDaysCode = { "日", "一", "二", "三", "四", "五", "六" };
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int index = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		return weekDaysCode[index];
	}
	/**
	 * 根据日期获取年份
	 * @param date
	 * @return
	 */
	public static String getYearFromDate(Date date)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		String index = "" + calendar.get(Calendar.YEAR);
		return index;
	}
	/**
	 * 根据日期获取月份
	 * @param date
	 * @return
	 */
	public static String getMonthFromDate(Date date)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		String index = "" + (calendar.get(Calendar.MONTH) + 1);
		return index;
	}
	
	/**
	 * 当前天剩余秒数
	 * @return
	 */
	public static long getLeftSecondsOfDay(){
		long currTime = System.currentTimeMillis();
		Date midNight = parseDateTime2(formatDate(new Date(), "yyyy-MM-dd 23:59:59"));
		return (midNight.getTime() - currTime) /1000;
	}

	/**
	 * 
	 * 方法描述: 格式化当前系统时间
	 * @param format 格式化字符串
	 * @return
	 */
	public static String getSysDateFormat(String format){
		return formatDate(getSysdate(), format);
	}
	public static Date getSysDateNoMillis(){
		long l = System.currentTimeMillis();
		l/=1000;
		l*=1000;
		return new Date(l);
	}
}
