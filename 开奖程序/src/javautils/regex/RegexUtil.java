/*     */ package javautils.regex;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import javautils.StringUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class RegexUtil
/*     */ {
/*     */   public static final String image_regex = "^(/{0,1}\\w){1,}\\.(gif|dmp|png|jpg|jpeg)$|^\\w{1,}\\.(gif|dmp|png|jpg|jpeg)$";
/*     */   public static final String email_regex = "(?:\\w[-._\\w]*\\w@\\w[-._\\w]*\\w\\.\\w{2,3}$)";
/*     */   public static final String url_regex = "(\\w+)://([^/:]+)(:\\d*)?([^\\s]*)";
/*     */   public static final String http_regex = "(http|https|ftp)://([^/:]+)(:\\d*)?([^\\s]*)";
/*     */   public static final String date_regex = "^((((19){1}|(20){1})d{2})|d{2})[-\\s]{1}[01]{1}d{1}[-\\s]{1}[0-3]{1}d{1}$";
/*     */   public static final String phone_regex = "^(?:0[0-9]{2,3}[-\\s]{1}|\\(0[0-9]{2,4}\\))[0-9]{6,8}$|^[1-9]{1}[0-9]{5,7}$|^[1-9]{1}[0-9]{10}$";
/*     */   public static final String ID_card_regex = "^\\d{10}|\\d{13}|\\d{15}|\\d{18}$";
/*     */   public static final String ZIP_regex = "^[0-9]{6}$";
/*     */   public static final String non_special_char_regex = "^[^'\"\\;,:-<>\\s].+$";
/*     */   public static final String non_negative_integers_regex = "^\\d+$";
/*     */   public static final String non_zero_negative_integers_regex = "^[1-9]+\\d*$";
/*     */   public static final String positive_integer_regex = "^[0-9]*[1-9][0-9]*$";
/*     */   public static final String non_positive_integers_regex = "^((-\\d+)|(0+))$";
/*     */   public static final String negative_integers_regex = "^-[0-9]*[1-9][0-9]*$";
/*     */   public static final String integer_regex = "^-?\\d+$";
/*     */   public static final String non_negative_rational_numbers_regex = "^\\d+(\\.\\d+)?$";
/*     */   public static final String positive_rational_numbers_regex = "^(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*))$";
/*     */   public static final String non_positive_rational_numbers_regex = "^((-\\d+(\\.\\d+)?)|(0+(\\.0+)?))$";
/*     */   public static final String negative_rational_numbers_regex = "^(-(([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)))$";
/*     */   public static final String rational_numbers_regex = "^(-?\\d+)(\\.\\d+)?$";
/*     */   public static final String letter_regex = "^[A-Za-z]+$";
/*     */   public static final String upward_letter_regex = "^[A-Z]+$";
/*     */   public static final String lower_letter_regex = "^[a-z]+$";
/*     */   public static final String letter_number_regex = "^[A-Za-z0-9]+$";
/*     */   public static final String letter_number_underline_regex = "^\\w+$";
/*     */   public static final String name_input_chn = "[一-龥]";
/*     */   
/*     */   public static boolean isMatcher(String s, String regex)
/*     */   {
/* 176 */     boolean flag = false;
/*     */     try {
/* 178 */       if (StringUtil.isNotNull(s)) {
/* 179 */         Pattern pattern = Pattern.compile(regex);
/* 180 */         Matcher matcher = pattern.matcher(s);
/* 181 */         flag = matcher.matches();
/*     */       }
/*     */     } catch (Exception e) {
/* 184 */       e.printStackTrace();
/* 185 */       System.out.println("匹配失败！");
/*     */     }
/* 187 */     return flag;
/*     */   }
/*     */ }


/* Location:              /Users/vincent/Downloads/至尊程序/lotteryOpen/lotteryOpen.jar!/javautils/regex/RegexUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */