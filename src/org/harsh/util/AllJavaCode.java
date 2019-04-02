/**
 * AllJavaCode.java version 1.0
 *
 * @author Harsh Bansal Copyright (c) 2011, Harsh Bansal
 */

package org.harsh.util;

/*
 * import common.Logger; import net.sf.jasperreports.engine.*; import net.sf.jasperreports.engine.export.*; import
 * org.apache.log4j.Logger; import org.apache.poi.hssf.usermodel.HSSFCell; import org.apache.poi.hssf.usermodel.HSSFRow;
 * import org.apache.poi.hssf.usermodel.HSSFSheet; import org.apache.poi.hssf.usermodel.HSSFWorkbook; import
 * org.apache.poi.poifs.filesystem.POIFSFileSystem;
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.MalformedInputException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.attribute.BasicFileAttributes;
import java.security.CodeSource;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.ProtectionDomain;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.Collator;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.MessageFormat;
import java.text.Normalizer;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang.time.StopWatch;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.codehaus.jackson.map.ObjectMapper;
import org.harsh.util.other.DeletingFileVisitor;
import org.json.JSONException;
import org.json.JSONObject;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
//import grandcentral.fileutils.FileShredder;
//import grandcentral.fileutils.Sherlock;
//import grandcentral.security.SimpleCrypto;
//import grandcentral.security.TokenAuthority;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * AllJavaCode class is a utility class for developing modules created by Harsh
 * Bansal.
 *
 * @author Harsh Bansal
 * @name AllJavaCode.java
 * @version 1.0 23-Dec-2009
 */
public class AllJavaCode extends Thread implements Serializable {
	private static final long serialVersionUID = -3824126402222342743L;

	private static final String UNICODE_FORMAT = "UTF8";

	private static final String UPLOAD_DIRECTORY = null;

	private static final String DEFAULT_COPY_PROPETIES_NAME = "C:\\temp\\copy.properties";

	private static final String COPY_FROM = "COPY_FROM";

	private static final String COPY_TO = "COPY_TO";

	private static final String COPY_FILE = "COPY_FILE";

	static String strFileNm = "D:" + File.separator + "Harsh" + File.separator + "read.xls";

	static Logger logger = Logger.getLogger("AllJavaCode");

	private static BufferedReader in;

	public AllJavaCode() {
		System.out.println("Private Constructor");
	}

	public static void main(String[] args) {
		try {
			logger.info(new Date() + " START " + Runtime.getRuntime().freeMemory());
			String strFileNm = "C:" + File.separator + "Harsh" + File.separator + "read.xls";
			javaDaysBetween2Dates();
			// freemarkerUtilitySimpleExample();
			// gameWaitTimeForCriminalCase();
			// harshUtilityChangeFolderDirectoryNames();
			// javaAddSubDate();
			// javaAsciiArtInJava();
			// javaBooleanFromString();
			// javaByteDigest();
			// javaCalculateTimingUsingStopwatch();
			// javaCallingMethodInvocationDynamically();
			// javaCharToString();
			// javaCheckArrayEqual();
			// javaCheckChar();
			// javaCheckDuplicatesInJavaArray();
			// javaCheckFileReferSameFile();
			// javaCheckLeapYr();
			// javaCheckPowerOfTwoInJava();
			// javaCheckStringIsDate();
			// javaCheckStringIsValidNum();
			// javaCheckWordInString();
			// javaCloneArrayVariables();
			// javaCollectionEmptyObject();
			// javaCollectionFindElementInSortedSet();
			// javaCollectionReadOnly();
			// javaCollectionSortList();
			// javaCollectiontoArray();
			// javaCollectionToStringWithDelimiterAsComma();
			// javaCollectionToStringWithSpringAndBack();
			// javaCompare2String();
			// javaCompareDates();
			// javaConsoleRead();
			// javaConvertArrayToCollection();
			// javaConvertIntgerOfListToPrimitiveInt();
			// javaConvertPngToJpeg();
			// javaCopyArraySomeElements();
			// javaCopyParameterFromOneClassToAnother();
			// javaCreateManifest4Jar();
			// javaCreatePropertiesFile();
			// javaCreateSecuredPasswordToken();
			// javaCreateXMLfileByPropertiesClass();
			// javaCreateZipFile();
			// javaCreatingAStringWithRuntimeValuesUsingFormatMethod();
			// javaDateCurrentDate();
			// javaDateToStringAndStringBacktoDate();
			// javaDeleteDuplicateFromArrayList();
			// javaDifferentDateFormat();
			// javaDynamicFileCopyFromPropertiesFile(args);
			// javaEncryptDecrypt();
			// javaExecuteWindowsApplication();
			// javaExternalCmdOutputCapture();
			// javaEnumRead();
			// javaFindElementInArray();
			// javaFindFilesUsingGrandCentral();
			// javaFormatMessage();
			// javaFormatNumber2Currency();
			// javaFormattingNumber();
			// javaGenerateJpegPngFile();
			// javaGenerateRandomNumber();
			// javaGenerateRandonKeysInHashtable();
			// javaGetCurrentMonth();
			// javaGetFormatZipCode();
			// javaGetImageFromNetwork();
			// javaGetMapKeysAndValues();
			// javaGetSomeDateAndDetails();
			// javaGetUniqueValue4mExcel(strFileNm);
			// javaInitializeListByInnerClass();
			// javaInputStreamDigest();
			// javaI18nL10nExamples();
			// javaIOChangeFolderName();
			// javaIOCheckFileorDirAndPresent();
			// javaIOCopyDirectory(new File("D:/Harsh/Upload"), new
			// File("D:/Harsh/Upload1"));
			// javaIOCopyFile();
			// javaIOCreateFileandDelete();
			// javaIODeleteDirectory();
			// javaIOFileMove();
			// javaIOForcfullyWritingOnDisc();
			// javaIOGetAbsoulteRelativePath(strFileNm);
			// javaIOGetParentFileandPath(strFileNm);
			// javaIOGettingFileDesc();
			// javaIOGetURLContent();
			// javaIOIURLgetFilePathandURL("D://harsh//txt1.txt");
			// javaIOLinesInFile();
			// javaIOListSystemFileDiectory();
			// javaIOListSystemFileRoot();
			// javaIOMovefile();
			// javaIOReadFile();
			// javaIOReadFileByCommon();
			// javaIORenameFileandAppend();
			// javaIOWriteFile();
			// javaJsonExample();
			// javaJsonreadObject();
			// javaJsonWriteObject();
			// javaJDBCRowSet();
			// javaListingAllLocaleVariable();
			// javaListJarFiles();
			// javaListManifest4mJar();
			// javaListOfCountries();
			// javaListOfCountries();
			// javaListOfCountriesByLanguage(Locale.US);
			// javaListOfCountriesInOwnLanguage();
			// javaListZipContent();
			// javaListZipContentAndReadFiles();
			// javaLoggingInXml();
			// javaLoggingWithOutXMLProperties();
			// javaMajorMinorVersionOfJavaClass();
			// javaNIOCreatFile();
			// javaNIOCopyFileExample();
			// javaNIODeleteDirectoryRecursively();
			// javaNIOFileListUsingNIO2InJava7();
			// javaNIOfileMoveIn();
			// javaNIOFilesModifiedAfter();
			// javaNIOfileWatcher();
			// javaNIOFileWatcherForEver();
			// javaNIOFileWriteAsynchronous();
			// javaNIOfindFilesInDirectories();
			// javaNIOMemoryMappedUsingRandomAccessFileClass();
			// javaNIOReadDirectory();
			// javaNIOReadFile();
			// javaNIOReadFileAsynchronously();
			// javaNIOReadFileUsingFileChannel();
			// javaNumberOfDaysInMonth();
			// javaPasswordSecuredByMD5();
			// javaPDFCombine();
			// javaPDFPasswordProtect();
			// javaPlaySound();
			// javaQRResponseCode();
			// javaReadEnvVariables();
			// javaReadOutputCommand();
			// javaReadProperties();
			// javaReadPropertiesFromXML();
			// javaReadUserInputConsoleJOptionPanel();
			// javaRedirectOutputToSystemStream();
			// javaReflectionCallingPrivateConstructor();
			// javaReflectioncallingPrivateFieldsAndMethods();
			// javaRegexCheck();
			// javascriptRunFromJava();
			// javaSecurityGetIpAddress();
			// javaShallowCopyCollection();
			// javaShedFilesUsingGrandCentral();
			// javaSimpleCryptoForEncryptingUsingGrandCentral();
			// javaSortArray();
			// javaSortObject();
			// javaSpiltUsingStringTokenizer();
			// javaStringChecking();
			// javaStringDigest();
			// javaStringFormat();
			// javaStringGetClassLoaderOfAnyClass();
			// javaStringGetStringInDifferentFormats();
			// javaStringRemoveNonASCIICharacters();
			// javaStringSplitTokenizerWithMultipleregex();
			// javaStringToDate();
			// javaSystemCall();
			// javaSystemCallProcessOrCommand();
			// javaSystemDisplayAllVar();
			// javaSystemGetPathClasspath();
			// javaSystemGetTempLocationOnExecutingMachine();
			// javaSystemLoadJarAtRunTime();
			// javaTerminateJavaApp();
			// javaThreadRunningUsingCountDownLatch();
			// javaTimerClass();
			// javaTimeZoneConvertor();
			// javaVerifyDigitalSignatureOfSignedData();
			// javaWritingLogFile();
			// javaXMLAddContent2File();
			// javaXMLParse();
			// javaXMLReadNode("C:\\Harsh\\temp\\1.xml");
			// javaXMLMashallingUnmarshalling();
			// javaZipCompressFile2Gzip();
			// javaZipCompressFiles("zip.zip");
			// javaZipCompressFolder();
			// javaZipUncompressGzip2File();
			// jdbcBatchProcess();
			// jdbcDBConnection();
			// jdbcGetPrimaryKeyOfInsertedRecord();
			// jspServletFileUpload();
			// jspServletFileUploadInAnotherWay();
			// jspServletGetResponseHeaderDetails();
			// jspServletReceiveHttpRequestUsingGetPostInJava();
			// jspServletSendHttpRequestUsingGetPostInJava();
			// jsServletdownloadFileFromHttpAndHttps();
			// junitMockitoPowerMockSampleCode();
			// new AllJavaCode().javaRefelectionObjectTypeAndClassLoc();
			// springGetUserDetails();
			javaTakeSnapshot();
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info(new Date() + " END " + Runtime.getRuntime().freeMemory());
	}

	/**
	 * This method finds days between 2 dates i.e 20-Mar to 5-Apr
	 */
	private static int javaDaysBetween2Dates() {
		int workingDays = 0;
		Date startDate = new GregorianCalendar(2017, Calendar.MARCH, 17).getTime();
		Date endDate = new GregorianCalendar(2017, Calendar.APRIL, 5).getTime();

		Calendar calStartDate = Calendar.getInstance();
		calStartDate.setTime(startDate);
		Calendar calEndDate = Calendar.getInstance();
		calEndDate.setTime(endDate);

		if (calStartDate.getTimeInMillis() == calEndDate.getTimeInMillis()) {
			System.out.println("Dates are same");
			return workingDays;
		}
		while (calStartDate.getTime().compareTo(calEndDate.getTime()) < 0) {
			if (calStartDate.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
					&& calStartDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
				workingDays++;
			}
			calStartDate.add(Calendar.DAY_OF_MONTH, 1);
		}
		return workingDays;
	}

	/**
	 * this method take runtime argument which is the properties file and then copy
	 * the files according to the properties file.
	 *
	 * @param args
	 */
	private static void javaDynamicFileCopyFromPropertiesFile(String[] args) {
		String strPropNm = DEFAULT_COPY_PROPETIES_NAME;
		boolean bFlag = true;
		if (args != null && args.length > 0) {
			strPropNm = args[0];
			System.out.println("Argument sent are " + strPropNm);
			bFlag = false;
		} else {
			System.out.println("Argument sent were null so setting default properties file name " + strPropNm);
		}
		boolean bFilePresent = javaIOFilePresentFullLocation(strPropNm);
		System.out.println("File Present check : " + bFilePresent);
		if (!bFilePresent && !bFlag) {
			strPropNm = DEFAULT_COPY_PROPETIES_NAME;
			bFilePresent = javaIOFilePresentFullLocation(strPropNm);
			if (bFilePresent) {
				System.out.println("File not present hence exiting ");
				System.exit(1);
			}
		}
		System.out.println("Properties file to execute is " + strPropNm);
		Properties prop = javaReadProperties(strPropNm);
		List<Object> list = javaGetDataFromProp(prop);
		checkLocationAndFilePresence(list);
	}

	private static void checkLocationAndFilePresence(List<Object> list) {
		System.out.println(list);
		int i = 1;
		for (Object object : list) {
			Map<String, Object> map = (Map<String, Object>) object;
			String str = COPY_FROM + "_" + i;
			str = map.get(str) == null ? "" : map.get(str).toString();
			boolean bFlagFrom = javaIOFilePresentFullLocation(str);
			str = COPY_TO + "_" + i;
			str = map.get(str) == null ? "" : map.get(str).toString();
			boolean bFlagTo = javaIOFilePresentFullLocation(str);
			System.out.println(bFlagFrom);
			System.out.println(bFlagTo);
			int j = 1;
			if (bFlagFrom && bFlagTo) {
				str = COPY_FILE + "_" + i + "_" + j;
				List<String> listFileNm = (List<String>) map.get(COPY_FILE);
				System.out.println(listFileNm);
				for (Object object2 : list) {
					System.out.println(object2);
				}
				j++;
			}
			i++;
		}
	}

	private static List<Object> javaGetDataFromProp(Properties prop) {
		List<Object> list = new ArrayList<Object>();
		for (int i = 1; i <= 2; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			String str = COPY_FROM + "_" + i;
			map.put(str, prop.getProperty(str));
			str = COPY_TO + "_" + i;
			map.put(str, prop.getProperty(str));
			List<String> listFileNm = new ArrayList<String>();
			if (map.get(COPY_FROM) != null && map.get(COPY_TO) != null) {
				for (int j = 1; j <= 25; j++) {
					str = COPY_FILE + "_" + i + "_" + j;
					String strFilenm = prop.getProperty(str);
					if (org.apache.commons.lang.StringUtils.isNotEmpty(strFilenm)) {
						listFileNm.add(strFilenm);
					}
				}
			}
			map.put(COPY_FILE, listFileNm);
			list.add(map);
		}
		return list;
	}

	/**
	 * This method checks if the file is present at location or not. If file is
	 * present then true is returned or false.
	 *
	 * @param strPropNm
	 *
	 * @return
	 */
	private static boolean javaIOFilePresentFullLocation(String strPropNm) {
		Path path = Paths.get(strPropNm);
		return Files.exists(path);
	}

	private static void javaJDBCRowSet() {
		String url = "jdbc:mysql://localhost:3306/addressBook";
		String userName = "root";
		String password = "mysql123";
		try { // first, create a factory object for rowset
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			// create a JDBC rowset from the factory
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
			// Set connection properties
			rowSet.setUrl(url);
			rowSet.setUsername(userName);
			rowSet.setPassword(password);
			// Set SQL Query to execute
			rowSet.setCommand("SELECT * FROM contact");
			rowSet.execute();
			System.out.println("id Name Department Email Salary");
			// Iterating over RowSet
			while (rowSet.next()) {
				System.out.println(
						rowSet.getInt("id") + "\t" + rowSet.getString("name") + "\t" + rowSet.getString("department")
								+ "\t" + rowSet.getString("email") + "\t" + rowSet.getString("salary"));
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}

	/**
	 * This method is used for marshalling and unmarshalling of Java object to and
	 * fro XML
	 */
	private static void javaXMLMashallingUnmarshalling() {
		// Creating booking object for marshaling into XML document
		Booking booking = new Booking();
		booking.setName("Rohit");
		booking.setContact(983672431);
		DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		Date startDate = null;
		Date endDate = null;
		try {
			startDate = formatter.parse("11/09/2012");
			endDate = formatter.parse("14/09/2012");
		} catch (ParseException ex) {
			Logger.getLogger(AllJavaCode.class.getName()).log(Level.SEVERE, null, ex);
		}
		booking.setStartDate(startDate);
		booking.setEndDate(endDate);
		booking.setAddress("Mumbai");

		JAXBContext jaxbCtx = null;
		StringWriter xmlWriter = null;
		try {
			// XML Binding code using JAXB

			jaxbCtx = JAXBContext.newInstance(Booking.class);
			xmlWriter = new StringWriter();
			jaxbCtx.createMarshaller().marshal(booking, xmlWriter);
			System.out.println("XML Marshal example in Java");
			System.out.println(xmlWriter);

			Booking b = (Booking) jaxbCtx.createUnmarshaller().unmarshal(new StringReader(xmlWriter.toString()));
			System.out.println("XML Unmarshal example in JAva");
			System.out.println(b.toString());
		} catch (JAXBException ex) {
			Logger.getLogger(AllJavaCode.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * This method reads the enum from TestEnum Class
	 */
	private static void javaEnumRead() {
		TestEnum[] testenum = TestEnum.values();
		for (TestEnum testEnum2 : testenum) {
			System.out.println(testEnum2.getStatusCode());
			System.out.println(testEnum2);
		}
	}

	/**
	 * This method changes the name of the file name in upper first character and
	 * then lower case
	 */
	private static void harshUtilityChangeFolderDirectoryNames() {
		final Map<String, String> mapFileNm = new HashMap<String, String>();
		String strLocation = "C:\\harsh\\personal\\downloads\\to_process\\lenovo_dell\\Music_video";
		// strLocation = "c:\\temp\\1";
		final Path rootDir = Paths.get(strLocation);
		try {
			Files.walkFileTree(rootDir, new FileVisitor<Path>() {
				// First (minor) speed up. Compile regular expression pattern
				// only one time.

				@Override
				public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes atts) throws IOException {
					String value = path.toString().substring(0, path.toString().lastIndexOf("\\")) + File.separator
							+ WordUtils.capitalize(path.toString()
									.substring(path.toString().lastIndexOf("\\") + 1, path.toString().length())
									.toLowerCase());
					mapFileNm.put(path.toString(), value);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFile(Path path, BasicFileAttributes mainAtts) throws IOException {
					String value = path.toString().substring(0, path.toString().lastIndexOf("\\")) + File.separator
							+ WordUtils.capitalize(path.toString()
									.substring(path.toString().lastIndexOf("\\") + 1, path.toString().length())
									.toLowerCase());
					mapFileNm.put(path.toString(), value);
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult postVisitDirectory(Path path, IOException exc) throws IOException {
					System.out.println(path.toString());
					return FileVisitResult.CONTINUE;
				}

				@Override
				public FileVisitResult visitFileFailed(Path path, IOException exc) throws IOException {
					exc.printStackTrace();
					return path.equals(rootDir) ? FileVisitResult.TERMINATE : FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			System.out.println("Exception raised");
		}

		Set<Entry<String, String>> setMapFileNm = mapFileNm.entrySet();
		Iterator<Entry<String, String>> iterator = setMapFileNm.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			File fileSourceFile = new File(entry.getKey());
			File fileDestNm = new File(entry.getValue());
			boolean bFlag = fileSourceFile.renameTo(fileDestNm);
			if (!bFlag)
				System.out.println("File couldn't be renamed " + entry.getKey());
		}
		System.out.println("Total of " + mapFileNm.size() + " file & directory are renamed");
	}

	/**
	 * This is method to use the Log4j without XML or properties. add the following
	 * classes into as import in class import org.apache.log4j.BasicConfigurator;
	 * import org.apache.log4j.Level; import org.apache.log4j.Logger;
	 */
	private static void javaLoggingWithOutXMLProperties() {
		// Logger logger = Logger.getLogger(Log4JConfigurator.class);
		// BasicConfigurator.configure(); // enough for configuring log4j
		//
		// Logger.getRootLogger().setLevel(Level.WARN); // changing log level
		//
		// logger.error("Critical message, almost fatal");
		// logger.warn("Warnings, which may lead to system impact");
		// logger.info("Information");
		// logger.debug("Debugging information ");
	}

	/**
	 * Java introduced this new class java.nio.channels.AsynchronousFileChannel for
	 * reading, writing and manipulating file. It can perform read, write, and other
	 * file operations at a given position in file in asynchronous mode. Here is an
	 * AsynchronousFileChannel example of writing to a file using this (
	 * AsynchronousFileChannel Java 7 ) class. Steps that we follow to write to a
	 * file are Open a file using AsynchronousFileChannel This allows us to open a
	 * file in different modes from java.nio.file.StandardOpenOption class. Mostly
	 * used modes are to read, write, create, and append. Few special purpose modes
	 * are create_new to create new file each time, delete on close to delete file
	 * when everything is done and we want to close, truncate existing to truncate
	 * all contents to a 0 length file etc. Define a CompletionHandler for file This
	 * handler is used to handle the two completion scenarios through completed and
	 * failed method callbacks. Completed method also populates result integer which
	 * is number of bytes written in this case. On failure we are keeping things
	 * simple, just printing the exception information. Write using
	 * AsynchronousFileChannel It writes the string to file using write method and
	 * handles result using the CompletionHandler instance.
	 */
	private static void javaNIOFileWriteAsynchronous() {
		Path file = null;
		AsynchronousFileChannel asynchFileChannel = null;
		String filePath = "D:\\Deepak\\WebSite\\DeepakGaikwadNet\\Resources\\AsynchNIODataFile.txt";
		try {
			file = Paths.get(filePath);
			asynchFileChannel = AsynchronousFileChannel.open(file, StandardOpenOption.WRITE, StandardOpenOption.CREATE);

			CompletionHandler<Integer, Object> handler = new CompletionHandler<Integer, Object>() {
				@Override
				public void completed(Integer result, Object attachment) {
					System.out.println("Thread: " + Thread.currentThread().getName()
							+ " File Write Completed with Result:" + result);
				}

				@Override
				public void failed(Throwable e, Object attachment) {
					System.err.println("File Write Failed Exception:");
					e.printStackTrace();
				}
			};
			System.out.println("Thread: " + Thread.currentThread().getName() + " Before write call");
			asynchFileChannel.write(ByteBuffer.wrap("I am writing using Asynchronous NIO.".getBytes()), 0, "File Write",
					handler);
			System.out.println("Thread: " + Thread.currentThread().getName() + " After write call");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				asynchFileChannel.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	/**
	 * This method will create and read the QR response code
	 */
	private static void javaQRResponseCode() {
		String qrCodeData = "Hello World! I am Harsh Bansal";
		String filePath = "QRCode.png";
		String charset = "UTF-8"; // or "ISO-8859-1"
		Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<EncodeHintType, ErrorCorrectionLevel>();
		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

		try {
			createQRCode(qrCodeData, filePath, charset, hintMap, 200, 200);
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("QR Code image created successfully!");

		try {
			System.out.println("Data read from QR Code: " + readQRCode(filePath, charset, hintMap));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method will create the QR Code
	 *
	 * @param qrCodeData
	 * @param filePath
	 * @param charset
	 * @param hintMap
	 * @param qrCodeheight
	 * @param qrCodewidth
	 * @throws WriterException
	 * @throws IOException
	 */
	public static void createQRCode(String qrCodeData, String filePath, String charset, Map hintMap, int qrCodeheight,
			int qrCodewidth) throws WriterException, IOException {
		BitMatrix matrix = new MultiFormatWriter().encode(new String(qrCodeData.getBytes(charset), charset),
				BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight, hintMap);
		MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
	}

	/**
	 * This method will read the QR Code
	 *
	 * @param filePath
	 * @param charset
	 * @param hintMap
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws NotFoundException
	 */
	public static String readQRCode(String filePath, String charset, Map hintMap)
			throws FileNotFoundException, IOException, NotFoundException {
		BinaryBitmap binaryBitmap = new BinaryBitmap(
				new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(new FileInputStream(filePath)))));
		Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap, hintMap);
		return qrCodeResult.getText();
	}

	/**
	 * This method shows the feature of memory mapped class like RandomAccessFile
	 * for quciker response where OS loads the file into the memory and file is
	 * available directly for access
	 */
	private static void javaNIOMemoryMappedUsingRandomAccessFileClass() {
		int count = 1010241024; // 10 MB
		RandomAccessFile memoryMappedFile;
		MappedByteBuffer out;
		try {
			memoryMappedFile = new RandomAccessFile("largeFile.txt", "rw");
			// Mapping a file into memory
			out = memoryMappedFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0, count);
			// Writing into Memory Mapped File
			for (int i = 0; i < count; i++) {
				out.put((byte) 'A');
			}
			System.out.println("Writing to Memory Mapped File is completed");

			// reading from memory file in Java
			for (int i = 0; i < 10; i++) {
				System.out.print((char) out.get(i));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Reading from Memory Mapped File is completed");

	}

	/**
	 * This method finds the java class version of class.
	 */
	private static void javaMajorMinorVersionOfJavaClass() {
		String version = "";
		String filename = "C:/harsh/SAP/workspace/BasicJavaTesting/bin/com/tutorialspoint/LoggingAspect.class";
		DataInputStream stream;
		try {
			stream = new DataInputStream(new FileInputStream(filename));
			int magicBytes = stream.readInt();
			if (magicBytes != 0xcafebabe) {
				System.out.println(filename + " is not a valid java file!");
			} else {
				int minorVersion = stream.readUnsignedShort();
				int majorVersion = stream.readUnsignedShort();
				version = majorVersion + "." + minorVersion;
			}
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Version of java Class is " + version);
	}

	/**
	 * This method provide various ways to format the values for
	 * internationalization and Localization. Like NumberFormat,
	 * DecimalFormat,DecimalFormatSymbols, DateFormat,DateFormatSymbols
	 */
	private static void javaI18nL10nExamples() {
		Locale locale = new Locale("en"); // English language
		Locale locale1 = new Locale("en", "UK"); // English language, United
													// Kingdom
		Locale locale2 = new Locale("en", "CA");
		Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale aLocale = Locale.forLanguageTag("en-US");
		System.out.println(locale.toLanguageTag()); // en
		System.out.println(aLocale); // en_US
		Locale locale4 = new Locale("da", "DK");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("ApplicationResources", locale4);
		System.out.println(resourceBundle.getString("global.name"));
		// resource bundle in com directory. If there is any properties files
		// with ApplicationResources_da.properties in
		// com directory then that file will be loaded otherwise
		// ApplicationResources.properties will be loaded as
		// default
		resourceBundle = ResourceBundle.getBundle("com.ApplicationResources", locale4);
		System.out.println(resourceBundle.getString("label1"));
		// Number formatting according to locale
		NumberFormat numberFormat = NumberFormat.getInstance(locale4);
		String string = numberFormat.format(100.99);
		System.out.println(string); // 100,99 and not 100.99. There is a comma
									// and not the decimal point
		// Currency formatting
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale4);
		String currency = currencyFormat.format(100.999);
		System.out.println(currency);// kr 101,00 with the currency sign
		currencyFormat.setCurrency(Currency.getInstance("EUR"));
		currency = currencyFormat.format(100.999);
		System.out.println(currency); // � 101,00 as currency is now changed to
										// EURO
		// Decimal Format
		String pattern = "###,###.###";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String deString = decimalFormat.format(1009876.98);
		System.out.println(deString);// 1,009,876.98
		// Decimal format according to locale
		locale = new Locale("en", "UK");
		pattern = "###.##";
		decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
		decimalFormat.applyPattern(pattern);
		String format = decimalFormat.format(123456789.123);
		System.out.println(format); // 123456789.12
		// pattern with 0
		pattern = "000000.000";
		decimalFormat.applyPattern(pattern);
		format = decimalFormat.format(1234.8765);
		System.out.println(format);// 001234.876 ---5 is trimmed
		// 0 A digit - always displayed, even if number has less digits (then 0
		// is displayed)
		// # A digit, leading zeroes are omitted.
		// . Marks decimal separator
		// , Marks grouping separator (e.g. thousand separator)
		// E Marks separation of mantissa and exponent for exponential formats.
		// ; Separates formats
		// - Marks the negative number prefix
		// % Multiplies by 100 and shows number as percentage
		// ? Multiplies by 1000 and shows number as per mille
		// � Currency sign - replaced by the currency sign for the Locale. Also
		// makes formatting use the monetary
		// decimal separator instead of normal decimal separator. �� makes
		// formatting use international monetary
		// symbols.
		// X Marks a character to be used in number prefix or suffix
		// ' Marks a quote around special characters in prefix or suffix of
		// formatted number.

		// Decimal Format Symbols-- will help in changing he decimal separator
		// and grouping separator
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
		symbols.setDecimalSeparator(';');
		symbols.setGroupingSeparator(':');
		pattern = "#,##0.###";
		decimalFormat = new DecimalFormat(pattern, symbols);
		String number = decimalFormat.format(123456789.123);
		System.out.println(number); // 123:456:789;123
		// GroupingFormat will set how many digits of integer part to group
		pattern = "#,###.###";
		decimalFormat = new DecimalFormat(pattern);
		decimalFormat.setGroupingSize(4);
		number = decimalFormat.format(123456789.123);
		System.out.println(number);// 1,2345,6789.123
		// Same can achived if we change the pattern to ####,####.###
		pattern = "####,####.###";
		decimalFormat = new DecimalFormat(pattern);
		number = decimalFormat.format(123456789.123);
		System.out.println(number); // 1,2345,6789.123

		// Date format for formatting the date
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateFormat.format(new Date());
		System.out.println(date);// Sep 10, 2013
		dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale4);
		date = dateFormat.format(new Date());
		System.out.println(date);// 10-09-2013 so the according the locale date
									// format is changed

		// Formatting the time
		locale = new Locale("da", "DK");
		dateFormat = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		date = dateFormat.format(new Date());
		System.out.println(date);// 22:57:28

		// Formatting both date and time together
		dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, locale);
		date = dateFormat.format(new Date());
		System.out.println(date);// 10-09-2013 22:58:55

		// Simple date format for formatting the date
		pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		date = simpleDateFormat.format(new Date());
		System.out.println(date); // 2013-09-10

		// parsing the date
		pattern = "yyyy-MM-dd";
		simpleDateFormat = new SimpleDateFormat(pattern);
		Date date1;
		try {
			date1 = simpleDateFormat.parse("2012-12-24");
			System.out.println(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// different date patterns
		pattern = "EEEEE MMMMM yyyy HH:mm:ss.SSSZ";
		simpleDateFormat = new SimpleDateFormat(pattern, new Locale("da", "DK"));
		date = simpleDateFormat.format(new Date());
		System.out.println(date);// tirsdag september 2013 23:45:04.640+0530

		simpleDateFormat = new SimpleDateFormat(pattern);
		date = simpleDateFormat.format(new Date());
		System.out.println(date);// Tuesday September 2013 23:47:14.642+0530

		// Date format symbols to display different day of week
		DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
		dateFormatSymbols.setWeekdays(new String[] { "Unused", "Sad Sunday", "Manic Monday", "Thriving Tuesday",
				"Wet Wednesday", "Total Thursday", "Fat Friday", "Super Saturday", });

		pattern = "EEEEE MMMMM yyyy";
		simpleDateFormat = new SimpleDateFormat(pattern, dateFormatSymbols);
		date = simpleDateFormat.format(new Date());
		System.out.println(date);

		// Character checking
		char aChar = 'C';
		Character.isDigit(aChar); // returns false
		Character.isLetter(aChar); // returns true
		Character.isLetterOrDigit(aChar); // returns true
		Character.isLowerCase(aChar); // returns false
		Character.isUpperCase(aChar); // returns true
		Character.isSpaceChar(aChar); // returns false

		aChar = '�';
		int type = Character.getType(aChar);

		if (type == Character.LOWERCASE_LETTER) {
			System.out.println("Lower case letter");
		}
		if (type == Character.UPPERCASE_LETTER) {
			System.out.println("Upper case letter");
		}

		// Comparing two strings in locale one has to use Collator
		locale = Locale.UK;
		Collator collator = Collator.getInstance(locale);
		int result = collator.compare("A", "B");
		System.out.println(result);

		String normalizedText = Normalizer.normalize("Text to normalize", Normalizer.Form.NFD);
		System.out.println(normalizedText);
	}

	/**
	 * This method lists the files which are modified after a particular date in the
	 * directory provided. There are 2 ways to achive it, one by using the Apache
	 * fileutil class and another is by using the NIO from java 7
	 */
	private static void javaNIOFilesModifiedAfter() {
		ZipOutputStream output = null;
		FileOutputStream destination = null;
		int BUFFER_SIZE = 2048;
		StopWatch stopWatch = new StopWatch();
		String strLocation = "C:/repository/Deliverables/Regional/eBanking/branches/HKLite";
		System.out.println("Checking Folder for File Upload is " + strLocation);
		// strLocation = "C:/repository";
		File file = new File(strLocation);
		final List<String> listFileNames = new ArrayList<String>();
		final Calendar calendar = new GregorianCalendar(2013, Calendar.OCTOBER, 11);

		if (file.exists()) {
			// using the below process it takes a lot of time in case there are
			// lots of files
			// stopWatch.start();
			// Collection files = FileUtils.listFiles(file, new
			// RegexFileFilter("^(.*?)"),
			// DirectoryFileFilter.DIRECTORY);
			// for (Object object : files) {
			// System.out.println(object.toString());
			// }
			// stopWatch.stop();
			// System.out.println(stopWatch.getTime());
			// stopWatch.reset();

			// This piece of code just provide the file listing on that
			// directory. Doesn't go inside the sub directories
			// stopWatch.start();
			// Path dir = FileSystems.getDefault().getPath(strLocation);
			// DirectoryStream<Path> stream;
			// try {
			// stream = Files.newDirectoryStream(dir);
			// for (Path path : stream) {
			// System.out.println(path.getFileName());
			// }
			// stream.close();
			// } catch (IOException e) {
			// e.printStackTrace();
			// }
			// stopWatch.stop();
			// System.out.println(stopWatch.getTime());
			// stopWatch.reset();

			stopWatch.start();
			final Path rootDir = Paths.get(strLocation);
			// Walk thru mainDir directory
			try {
				Files.walkFileTree(rootDir, new FileVisitor<Path>() {
					// First (minor) speed up. Compile regular expression
					// pattern only one time.
					private Pattern pattern = Pattern.compile("^(.*?)");

					@Override
					public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes atts) throws IOException {
						boolean matches = pattern.matcher(path.toString()).matches();
						return (matches) ? FileVisitResult.CONTINUE : FileVisitResult.SKIP_SUBTREE;
					}

					@Override
					public FileVisitResult visitFile(Path path, BasicFileAttributes mainAtts) throws IOException {
						boolean matches = pattern.matcher(path.toString()).matches();
						if (matches) {
							boolean bFlag = checkIfFileModified(calendar, path.toFile().lastModified());
							if (bFlag) {
								listFileNames.add(path.toString());
							}
						}
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult postVisitDirectory(Path path, IOException exc) throws IOException {
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult visitFileFailed(Path path, IOException exc) throws IOException {
						exc.printStackTrace();
						return path.equals(rootDir) ? FileVisitResult.TERMINATE : FileVisitResult.CONTINUE;
					}
				});
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		stopWatch.stop();
		System.out.println("Time taken in milli seconds to find the files " + stopWatch.getTime());
		System.out.println(
				"Number of Files Modified after " + calendar.getTime().toString() + " are " + listFileNames.size());

		stopWatch.reset();
		stopWatch.start();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMDD_HHMMSS");
		Date date = new Date();
		String strFileNm = "C:/Harsh/Backup/FileModifiedAfter_" + calendar.get(Calendar.DAY_OF_MONTH)
				+ calendar.get(Calendar.MONTH) + calendar.get(Calendar.YEAR) + "_BackupTime_"
				+ simpleDateFormat.format(date);
		String strZipFile = strFileNm + ".zip";
		String strTxtFile = strFileNm + ".txt";
		if (listFileNames != null && listFileNames.size() > 0) {
			Object[] strFiles = listFileNames.toArray();
			BufferedInputStream origin = null;
			File fileTextNm = new File(strTxtFile);
			BufferedWriter out = null;
			try {
				destination = new FileOutputStream(strZipFile);
				output = new ZipOutputStream(new BufferedOutputStream(destination));
				FileInputStream inStream = null;
				ZipEntry entry = null;
				int count;
				byte[] data = new byte[BUFFER_SIZE];
				if (!fileTextNm.exists()) {
					fileTextNm.createNewFile();
				}
				out = new BufferedWriter(new FileWriter(fileTextNm, true));
				for (Object string : strFiles) {
					String strFile = string.toString();
					out.write(strFile);
					out.write("\n");
					inStream = new FileInputStream(strFile);
					origin = new BufferedInputStream(inStream, BUFFER_SIZE);
					// entry = new
					// ZipEntry(string.toString().substring(string.toString().lastIndexOf("\\")
					// + 1));
					// System.out.println(strFile.substring(3,strFile.length()));
					// entry = new ZipEntry(string.toString());
					entry = new ZipEntry(strFile.substring(3, strFile.length()));
					output.putNextEntry(entry);

					while ((count = origin.read(data, 0, BUFFER_SIZE)) != -1) {
						output.write(data, 0, count);
					}
				}
				System.out.println("Zip created at " + strZipFile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (origin != null)
						origin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (output != null) {
					try {
						output.closeEntry();
						output.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if (out != null) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			stopWatch.stop();
			System.out.println("Time taken in milli seconds to create a Zip File " + stopWatch.getTime());
		} else {
			System.out.println("No file is modified");
		}
	}

	/**
	 * @param calendar
	 * @param longTimeModifiedl
	 * @return
	 */
	protected static boolean checkIfFileModified(Calendar calendar, long longTimeModifiedl) {
		boolean b = false;
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(longTimeModifiedl);
		b = cal.after(calendar);
		return b;
	}

	/**
	 * This method is like a file watcher which will run for ever and when there is
	 * a file created, deleted, event will be published
	 */
	private static void javaNIOFileWatcherForEver() {
		Path directory = Paths.get("C:\\temp");

		try {
			WatchService fileSystemWatchService = FileSystems.getDefault().newWatchService();
			WatchKey watchKey = directory.register(fileSystemWatchService, StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
			while (true) {
				WatchKey watchKeyActual = fileSystemWatchService.take();
				for (WatchEvent<?> event : watchKeyActual.pollEvents()) {
					WatchEvent.Kind<?> eventKind = event.kind();
					if (eventKind == StandardWatchEventKinds.OVERFLOW) {
						continue;
					}

					WatchEvent<Path> eventPath = (WatchEvent<Path>) event;
					Path fileName = eventPath.context();
					if (StandardWatchEventKinds.ENTRY_CREATE.equals(eventKind)) {
						System.out.println("Create Event  occurred on " + fileName);
					} else if (StandardWatchEventKinds.ENTRY_DELETE.equals(eventKind)) {
						System.out.println("Delete Event  occurred on " + fileName);
					} else if (StandardWatchEventKinds.ENTRY_MODIFY.equals(eventKind)) {
						System.out.println("Modify Event  occurred on " + fileName);
					}
				}
				boolean isReset = watchKeyActual.reset();
				if (!isReset) {
					break;
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

	/**
	 * This method delete the directory recursively using SimpleFileVisitor. If any
	 * file is not deleted then directory won't be deleted and an exception is
	 * raised. Java 7 nio package provides classes that make recursive operations on
	 * contents of a directory very easy. In previous versions, if we had to delete
	 * contents of directory, we would have written all logic, traversing,
	 * identifying if it is file or directory, and checking if directory is empty,
	 * on our own. Java 7 nio provides classes (which is FileVisitor in Java) that
	 * leave us to write only the actual operation to be done on the contents of
	 * directory. Traversing through contents is no more a programmer�s worry. Here
	 * is a FileVisitor Java example code explaining details of it. Let us delete
	 * all contents of a directory by traversing through all child directories. We
	 * would use a special purpose class provided in nio, SimpleFileVisitor. It
	 * implements FileVisitor interface to provide simple implementation on visit of
	 * a file. We are creating a file visitor that deletes files/directories on
	 * visit. We call it DeletingFileVisitor. It overrides methods to delete regular
	 * files, and directories (post visit to ensure those are empty).
	 */
	private static void javaNIODeleteDirectoryRecursively() {
		Path directoryToDelete = Paths.get("C:/TEMP/sybase");
		DeletingFileVisitor delFileVisitor = new DeletingFileVisitor();
		try {
			Files.walkFileTree(directoryToDelete, delFileVisitor);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	/**
	 * This method helps in reading the directory recursively in NIO with a file
	 * matching pattern also
	 */
	private static void javaNIOReadDirectory() {
		// starting with Dee
		searchDirectory("C:\\repository\\", "Dee*");
		// containing ee
		searchDirectory("C:\\repository\\", "*ee*");
		// .txt, .doc, .pdf, .ppt files
		searchDirectory("C:\\repository\\", "*.{txt,doc,pdf,ppt}");
		searchDirectory("C:\\repository\\", null);
	}

	/**
	 * @param directory
	 * @param pattern
	 */
	public static void searchDirectory(String directory, String pattern) {
		DirectoryStream<Path> directoryStream = null;
		try {
			if (pattern != null) {
				directoryStream = Files.newDirectoryStream(Paths.get(directory), pattern);
			} else {
				directoryStream = Files.newDirectoryStream(Paths.get(directory));
			}
			for (Path path : directoryStream) {
				System.out.println("Files/Directories matching " + pattern + ": " + path.toString());
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (directoryStream != null) {
					directoryStream.close();
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	/**
	 * This method reads a file using file channel
	 */
	private static void javaNIOReadFileUsingFileChannel() {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile("C:/temp/test.txt", "r");
			FileChannel fileChannel = file.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(24);
			int bytes = fileChannel.read(buffer);
			bytes = fileChannel.read(buffer);
			while (bytes != -1) {
				buffer.flip();
				while (buffer.hasRemaining()) {
					System.out.print((char) buffer.get());
				}
				buffer.clear();
				bytes = fileChannel.read(buffer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	/**
	 * This method reads a file using NIO
	 */
	private static void javaNIOReadFile() {
		Path file = null;
		BufferedReader bufferedReader = null;
		try {
			file = Paths.get("C:/temp/test.txt");
			InputStream inputStream = Files.newInputStream(file);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			System.out.println("Reading Line: " + bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	/**
	 * This method will create a simple file using NIO
	 */
	private static void javaNIOCreatFile() {
		Path path = null;
		BufferedWriter bufferedWriter = null;
		try {
			path = Files.createFile(Paths.get("C:/TEMP/test.txt"));
			Charset charset = Charset.forName("UTF-8");
			String line = "I am writing using NIO.";
			bufferedWriter = Files.newBufferedWriter(path, charset);
			bufferedWriter.write(line, 0, line.length());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method help in reterving the Primary key of Inserted Record
	 */
	private static void jdbcGetPrimaryKeyOfInsertedRecord() {
		Connection con = Mockito.mock(Connection.class);
		String QUERY = "INSERT INTO students " + "  VALUES (student_seq.NEXTVAL,"
				+ "         'Harry', 'harry@hogwarts.edu', '31-July-1980')";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(QUERY, new String[] { "student_id" });
			// local variable to hold auto generated student id
			Long studentId = null;
			// execute the insert statement, if success get the primary key
			// value
			if (ps.executeUpdate() > 0) {
				// getGeneratedKeys() returns result set of keys that were auto
				// generated in our case student_id column
				ResultSet generatedKeys = ps.getGeneratedKeys();

				// if resultset has data, get the primary key value
				// of last inserted record
				if (null != generatedKeys && generatedKeys.next()) {
					// voila! we got student id which was generated from
					// sequence
					studentId = generatedKeys.getLong(1);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method provides the sample code for mockito and powermock framework
	 */
	private static void junitMockitoPowerMockSampleCode() {
		MockitoAnnotations.initMocks(AllJavaCode.class);
		/*
		 * Mocking the objects using Mockito.mock. This can be achieved by using
		 * the @Mock annotation at instance variable also
		 */
		HttpServlet servlet = Mockito.mock(HttpServlet.class);
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		HttpSession session = Mockito.mock(HttpSession.class);
		final Map<String, String> extra = new HashMap<String, String>();
		final Map<String, Object> attributes = new HashMap<String, Object>();
		final Map<String, String> parameters = new HashMap<String, String>();
		/*
		 * Whenever there is a call for request.getSession() method then instead of
		 * calling that method, mock session object is returned.
		 */
		PowerMockito.when(request.getSession()).thenReturn(session);
//		PowerMockito.when(request.getParameterMap()).thenReturn(parameters);

		/*
		 * This statement will return the object whenever there is call a call for
		 * request.getParameter method with any string.
		 */
		PowerMockito.when(request.getParameter(Mockito.anyString())).thenAnswer(new Answer() {

			/**
			 * @see org.mockito.stubbing.Answer#answer(org.mockito.invocation.InvocationOnMock)
			 */
			@Override
			public Object answer(InvocationOnMock aInvocation) throws Throwable {
				String key = (String) aInvocation.getArguments()[0];
				return parameters.get(key);
			}
		});

		/*
		 * This statement will return the object whenever there is a call of
		 * session.getAttribute method with any string
		 */
		PowerMockito.when(session.getAttribute(Mockito.anyString())).thenAnswer(new Answer() {

			/**
			 * @see org.mockito.stubbing.Answer#answer(org.mockito.invocation.InvocationOnMock)
			 */
			@Override
			public Object answer(InvocationOnMock aInvocation) throws Throwable {
				String key = (String) aInvocation.getArguments()[0];
				return attributes.get(key);
			}
		});

		/*
		 * This statement will save the object whenever there is a call of
		 * session.setattribute.
		 */
		PowerMockito.doAnswer(new Answer() {
			/**
			 * @see org.mockito.stubbing.Answer#answer(org.mockito.invocation.InvocationOnMock)
			 */
			@Override
			public Object answer(InvocationOnMock aInvocation) throws Throwable {
				String key = (String) aInvocation.getArguments()[0];
				Object value = aInvocation.getArguments()[1];
				attributes.put(key, value);
				return null;
			}
		}).when(session).setAttribute(Mockito.anyString(), Mockito.anyObject());
		/*
		 * This statement mock the MessageContext class and will invoke any static block
		 * if present.
		 */
		// PowerMockito.mockStatic(MessageContext.class);
		// MessageContext context = PowerMockito.mock(MessageContext.class);
		// PowerMockito.when(context.getProperty("HTTP_SERVLETREQUEST")).thenReturn(request);
		AllJavaCode t = Mockito.mock(AllJavaCode.class);
		Mockito.when(t.called()).thenReturn("Method Call in testMethodTC01 ");
		System.out.println(t.called());
		// PowerMockito.mockStatic(SessionManager.class);
		// PowerMockito.when(SessionManager.getSessionForID(anyString())).thenReturn(session);
	}

	/**
	 * Sample method for showing the power of Mockito and PowerMock
	 *
	 * @return
	 */
	public String called() {
		System.out.println("called() method is called");
		return "return in called()";
	}

	/**
	 * Listing the files in a directory using NIO2 using Path in Java 7
	 */
	private static void javaNIOFileListUsingNIO2InJava7() {
		Path basePath = Paths.get("D:/tests");
		System.out.println("All files:");
		try {
			DirectoryStream<Path> pathList = Files.newDirectoryStream(basePath);
			for (Path path : pathList) {
				System.out.println(path.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method calls the methods using reflection invocation.
	 */
	private static void javaCallingMethodInvocationDynamically() {
		Class<?> loadedList = null;
		List<String> list = null;
		try {
			// loading class dynamically using reflection
			loadedList = Class.forName("java.util.ArrayList");
			list = (List<String>) loadedList.newInstance();

			// calling method using interface on reflective instance
			list.add("abc");
			list.add("bcd");

		} catch (InstantiationException ex) {
			System.err.println("Not able to create Instance of Class");
		} catch (IllegalAccessException ex) {
			System.err.println("Not able to access Class");
		} catch (ClassNotFoundException ex) {
			System.err.println("Not able to find Class");
		}
		System.out.println(list);

		try {
			// getting method instance reflectively
			Method m = loadedList.getMethod("size", (Class[]) null);

			// calling method in java using reflection dynamically
			Object size = m.invoke(list, (Object[]) null);
			System.out.println("Result of dynamically invoking method in Java, Size: " + size);

		} catch (NoSuchMethodException ex) {
			System.err.println("Not able to find Method on class");
			ex.printStackTrace();
		} catch (SecurityException ex) {
			System.err.println("Security Exception raised");
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			System.err.println("Not able to access method ");
			ex.printStackTrace();
		} catch (IllegalArgumentException ex) {
			System.err.println("Incorrect supplied arguments");
			ex.printStackTrace();
		} catch (InvocationTargetException ex) {
			System.err.println("Not able to invoke method by String in Java");
			ex.printStackTrace();
		}

	}

	/**
	 * Converts the time from one timezone to another.
	 */
	private static void javaTimeZoneConvertor() {
		// Date will return local time in Java
		Date localTime = new Date();

		// creating DateFormat for converting time from local timezone to GMT
		DateFormat converter = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss");

		System.out.println("local time : " + converter.format(localTime));
		// getting GMT timezone, you can get any timezone e.g. UTC
		converter.setTimeZone(TimeZone.getTimeZone("GMT"));

		System.out.println("GMT time   : " + converter.format(localTime));

	}

	/**
	 * Db connection sample code to connect to database
	 */
	private static void jdbcDBConnection() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "cbuser", "cbuser");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from CALL_BACKTIME");
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
			}
			System.out.println("=============");
			rs = stmt.executeQuery("select * from CALL_BACKTIME_DETAIL");
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getTime(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
			}
			System.out.println("=============");
			boolean bFlag = stmt.execute(
					"INSERT INTO call_backtime  (    call_backtime_id,    user_id,    agent_id,    created_time,    status,    reject_reason,    approval_time,    soft_delete  ) "
							+ " VALUES  (    4,    'test1',    'test2',    '29-Jul-13',    'Created',    'no rejection',    '29-Jul-13',    'Y'  )");
			System.out.println("insert is " + bFlag);
			bFlag = stmt.execute(
					"insert into CALL_BACKTIME_DETAIL (call_backtime_id,call_backtime_detail_id,slot_start,slot_end) values(1,1,sysdate,sysdate)");
			System.out.println("insert is " + bFlag);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * This method will show the temp directory of the machine on which code is been
	 * executed.
	 */
	private static void javaSystemGetTempLocationOnExecutingMachine() {
		String strTemp = System.getProperty("java.io.tmpdir");
		System.out.println("Temp directory is " + strTemp);
	}

	/**
	 * This method generates the zip file with the name specified at the location
	 * from where this code is executed.
	 */
	public static void javaZipCompressFiles(String OUTFILE) {
		int BUFFER_SIZE = 2048;
		int i, count;
		byte[] data = new byte[BUFFER_SIZE];
		String files[];
		File f = null;
		BufferedInputStream origin = null;
		FileInputStream inStream = null;
		FileOutputStream destination = null;
		ZipOutputStream output = null;
		ZipEntry entry = null;

		try {
			destination = new FileOutputStream(OUTFILE);
			output = new ZipOutputStream(new BufferedOutputStream(destination));
			f = new File("."); // All files in the directory where the
								// Compressor class is placed
			System.out.println("File is created at " + f.getAbsolutePath());
			files = f.list();

			for (i = 0; i < files.length; i++) {
				File file = new File(files[i]);

				if (file.isFile() && !(file.getName()).equals(OUTFILE)) {
					System.out.println("Compressing:" + files[i]);

					inStream = new FileInputStream(file);
					origin = new BufferedInputStream(inStream, BUFFER_SIZE);
					entry = new ZipEntry(files[i]);
					output.putNextEntry(entry);

					while ((count = origin.read(data, 0, BUFFER_SIZE)) != -1) {
						output.write(data, 0, count);
					}

					origin.close();
				}
			}

			output.close();
			System.out.println("File created " + OUTFILE);
		} catch (Exception e) {
			System.out.println("Execption raised while creating file " + OUTFILE);
			e.printStackTrace();
		}
	}

	/**
	 * Provide the Classloader name. Incase it is null, it means class loader is
	 * Bootstrap Class loader
	 */
	public static void javaStringGetClassLoaderOfAnyClass() {
		String strClassLoaderNm = AllJavaCode.class.getClassLoader().toString();
		System.out.println("Class Loader Name is " + strClassLoaderNm);
	}

	/**
	 * This method shows the message in String in different formats.
	 */
	public static void javaStringGetStringInDifferentFormats() {
		System.out.println(Charset.defaultCharset());
		String str = "Copy Right \u00A9";

		// uses the default encoding
		System.out.println(new String(str.getBytes()));

		// uses utf-8 encoding
		try {
			System.out.println(new String(str.getBytes("utf-8")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Calculates SHA-1 digest from byte array.
	 */
	private static void javaByteDigest() {
		System.out.println("SHAHashDemo.byteDigest");
		try {
			byte[] data = "The quick brown fox jumps over the lazy dog.".getBytes("UTF-8");
			String digest = DigestUtils.sha512Hex(data);
			System.out.println("Digest          = " + digest);
			System.out.println("Digest.length() = " + digest.length());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Calculates SHA-1 digest of InputStream object.
	 */
	private static void javaInputStreamDigest() {
		System.out.println("SHAHashDemo.inputStreamDigest");
		String data = System.getProperty("user.dir") + "/target/classes/data.txt";
		File file = new File(data);
		try {
			InputStream is = new FileInputStream(file);
			String digest = DigestUtils.sha512Hex(is);
			System.out.println("Digest          = " + digest);
			System.out.println("Digest.length() = " + digest.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Calculate SHA-1 digest of a string / text.
	 */
	private static void javaStringDigest() {
		System.out.println("SHAHashDemo.stringDigest");
		String data = "This is just a simple data message for SHA digest demo.";
		String digest = DigestUtils.sha512Hex(data);
		System.out.println("Digest          = " + digest);
		System.out.println("Digest.length() = " + digest.length());
	}

	/**
	 * This method can be used for the file upload in jsp and servlet
	 */
	private static void jspServletFileUpload() {
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		if (isMultipart) {

			ServletFileUpload servletFileUpload = new ServletFileUpload(new DiskFileItemFactory());
			List<FileItem> fileItemsList;
			try {
				fileItemsList = servletFileUpload.parseRequest(request);

				Iterator<FileItem> it = fileItemsList.iterator();
				File filetodownload = ((DiskFileItem) fileItemsList.get(0)).getStoreLocation();
				BufferedReader in = new BufferedReader(new FileReader(filetodownload));
				System.out.println(filetodownload);
				FileItem fileItem = it.next();
				InputStream io = fileItem.getInputStream();
				BufferedInputStream bf = new BufferedInputStream(io);
				int i;
				while ((i = bf.read()) != -1) {
					// System.out.println(i);
				}

				HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
				response.setContentType("text/plain");
				response.setHeader("Content-Disposition", "attachment; filename=\"harshTest.txt\"");
				response.setStatus(200);
				ServletOutputStream outs = response.getOutputStream();
				InputStream in1 = null;
				try {
					response.setContentLength(Integer.parseInt(String.valueOf(filetodownload.length())));
					in1 = new BufferedInputStream(new FileInputStream(filetodownload));
					int ch;
					while ((ch = in1.read()) != -1) {
						outs.print((char) ch);
					}
				} finally {
					if (in != null)
						in.close();
					if (in1 != null)
						in1.close();
				}
				outs.flush();
				outs.close();
			} catch (FileUploadException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * This method helps in file upload in jsp servlet. Dependencies are
	 * commons-fileupload-1.2.2.jar commons-io-2.4.jar maven should be as follows
	 * <dependency> <groupId>commons-fileupload</groupId>
	 * <artifactId>commons-fileupload</artifactId> <version>1.2.2</version>
	 * </dependency> <dependency> <groupId>commons-io</groupId>
	 * <artifactId>commons-io</artifactId> <version>2.4</version> </dependency> Read
	 * more: http://javarevisited.blogspot.com/2013/07/ile-upload-example-in
	 * -servlet-and-jsp-java-web-tutorial-example.html
	 */
	private static void jspServletFileUploadInAnotherWay() {

		// jsp code needs to be as follows
		// <div>
		// <h3> Choose File to Upload in Server </h3>
		// <form action="upload" method="post" enctype="multipart/form-data">
		// <input type="file" name="file" />
		// <input type="submit" value="upload" />
		// </form>
		// </div>

		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		if (ServletFileUpload.isMultipartContent(request)) {
			try {
				List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);

				for (FileItem item : multiparts) {
					if (!item.isFormField()) {
						String name = new File(item.getName()).getName();
						item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
					}
				}

				// File uploaded successfully
				request.setAttribute("message", "File Uploaded Successfully");
			} catch (Exception ex) {
				request.setAttribute("message", "File Upload Failed due to " + ex);
			}

		} else {
			request.setAttribute("message", "Sorry this Servlet only handles file upload request");
		}

		HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
		try {
			try {
				request.getRequestDispatcher("/result.jsp").forward(request, response);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ServletException e) {// | IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * different ways to convert string to date
	 */
	private static void javaDateToStringAndStringBacktoDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String dateInString = "7-Jun-2013";

		try {

			Date date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		dateInString = "07/06/2013";

		try {

			Date date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		formatter = new SimpleDateFormat("MMM dd, yyyy");
		dateInString = "Jun 7, 2013";

		try {

			Date date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		formatter = new SimpleDateFormat("E, MMM dd yyyy");
		dateInString = "Fri, June 7 2013";

		try {

			Date date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");
		dateInString = "Friday, Jun 7, 2013 12:10:56 PM";

		try {

			Date date = formatter.parse(dateInString);
			System.out.println(date);
			System.out.println(formatter.format(date));

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * calculates the time used to execute a process using stopwatch class need to
	 * import org.apache.commons.lang.time.StopWatch;
	 *
	 * @throws Exception
	 */
	private static void javaCalculateTimingUsingStopwatch() throws Exception {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		javaTakeSnapshot();
		stopWatch.stop();
		// Print out the total time of the watch
		System.out.println("Time: " + stopWatch.getTime());

		StopWatch stopWatch2 = new StopWatch();
		stopWatch2.start();
		javaTakeSnapshot();
		// Do some task and split the stopwatch time.
		stopWatch2.split();
		System.out.println("Split 1: " + stopWatch2.toSplitString());
		// Suspend the stopwatch and resume the stopwatch.
		stopWatch2.suspend();
		javaTakeSnapshot();
		stopWatch2.resume();

		// Do some task and split the stopwatch time.
		javaTakeSnapshot();
		stopWatch2.split();
		System.out.println("Split 2: " + stopWatch2.toSplitString());

		// Do some task and split the stopwatch time.
		javaTakeSnapshot();
		stopWatch2.split();
		System.out.println("Split 3: " + stopWatch2.toSplitString());

		// Stop the stopwatch and the the total execution time.
		stopWatch2.stop();
		System.out.println("Time: " + stopWatch2.getTime());
	}

	/**
	 * Clones the array variables quickly using ArraysUtil class import
	 * org.apache.commons.lang.ArrayUtils;
	 */
	private static void javaCloneArrayVariables() {
		int[] fibonacci = new int[] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 };
		System.out.println("fibonacci = " + ArrayUtils.toString(fibonacci));

		int[] clone = ArrayUtils.clone(fibonacci);
		System.out.println("clone = " + ArrayUtils.toString(clone));

		String[] colors = new String[] { "Red", "Green", "Blue", "Yellow" };
		System.out.println("colors = " + ArrayUtils.toString(colors));

		String[] strClone = (String[]) ArrayUtils.clone(colors);
		System.out.println("clone = " + ArrayUtils.toString(strClone));
	}

	/**
	 * Java program to demonstrate How to use CountDownLatch in Java. CountDownLatch
	 * is useful if you want to start main processing thread once its dependency is
	 * completed as illustrated in this CountDownLatch Example
	 */

	private static void javaThreadRunningUsingCountDownLatch() {
		final CountDownLatch latch = new CountDownLatch(3);
		Thread cacheService = new Thread(new Service("CacheService", 1000, latch));
		Thread alertService = new Thread(new Service("AlertService", 1000, latch));
		Thread validationService = new Thread(new Service("ValidationService", 1000, latch));

		cacheService.start(); // separate thread will initialize CacheService
		alertService.start(); // another thread for AlertService initialization
		validationService.start();

		// application should not start processing any thread until all service
		// is up and ready to do there job.
		// Countdown latch is idle choice here, main thread will start with
		// count 3 and wait until count reaches zero.
		// each thread once up and read will do a count down. this will ensure
		// that main thread is not started
		// processing until all services is up. count is 3 since we have 3
		// Threads (Services)

		try {
			latch.await(); // main thread is waiting on CountDownLatch to finish
			System.out.println("All services are up, Application is starting now");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}

	/**
	 * Creates a Json Obejct. Will require jackson-all-1.9.4.jar and need import
	 * org.codehaus.jackson.map.ObjectMapper;
	 *
	 * @throws Exception
	 */
	private static void javaJsonWriteObject() throws Exception {
		Map<String, Object> country = new HashMap<String, Object>();

		country.put("Name", "United States of America");
		country.put("Capital", "Washington, D.C.");

		Set<String> states = new HashSet<String>();
		states.add("Florida");
		states.add("Maryland");
		states.add("California");

		country.put("States", states);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("CountryFile.json"), country);
	}

	/**
	 * Read a Json Obejct. Will require jackson-all-1.9.4.jar and need import
	 * org.codehaus.jackson.map.ObjectMapper;
	 *
	 * @throws Exception
	 */
	private static void javaJsonreadObject() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> userData = mapper.readValue(new File("CountryFile.json"), Map.class);

		Set<?> mySet = userData.entrySet();

		for (Iterator<?> iterator = mySet.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

	/**
	 * Generates the keys random and there values
	 */
	private static void javaGenerateRandonKeysInHashtable() {

		Hashtable colors = new Hashtable();
		colors.put("black", "#000");
		colors.put("red", "#f00");
		colors.put("green", "#0f0");
		colors.put("blue", "#00f");
		colors.put("white", "#fff");

		//
		// Get a random entry from the hashtable.
		//
		Object[] keys = colors.keySet().toArray();
		Object key = keys[new Random().nextInt(keys.length)];
		System.out.println(key + " = " + colors.get(key));

	}

	/**
	 * This method is used for a simple check for freemarker template. This method
	 * will require freemarker-2.3.13.jar. For more details check
	 * http://viralpatel.net/blogs/introduction-to-freemarker-template-ftl/
	 */
	private static void freemarkerUtilitySimpleExample() {
		// Freemarker configuration object
		Configuration cfg = new Configuration();
		try {
			// Load template from source folder
			Template template = cfg.getTemplate("src/helloworld.ftl");

			// Build the data-model
			Map<String, Object> data = new HashMap<String, Object>();
			data.put("message", "Hello World!");

			// List parsing
			List<String> countries = new ArrayList<String>();
			countries.add("India");
			countries.add("United States");
			countries.add("Germany");
			countries.add("France");

			data.put("countries", countries);

			// Console output
			Writer out = new OutputStreamWriter(System.out);
			template.process(data, out);
			out.flush();
			out.close();

			// File output
			Writer file = new FileWriter(new File("D:\\FTL_helloworld.txt"));
			template.process(data, file);
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}

	/**
	 * TokenAuthority is used to create secure password tokens based on the time of
	 * day. This class is very simple to implement into your Java application. One
	 * need to download GrandCentral v1.-.jar. download from
	 * https://code.google.com/p/grandcentral/.
	 */
	private static void javaCreateSecuredPasswordToken() {
//		TokenAuthority.setPassword("yourPassword");
//		String strToken = new TokenAuthority().generateToken();
//		System.out.println(strToken);
//		// Now validation if the password is correct
//		TokenAuthority.setToken(strToken);
//		System.out.println(new TokenAuthority().validateToken());
	}

	/**
	 * This method is divided into four parts and description of each part is given
	 * below.One need to download GrandCentral v1.-.jar. download from
	 * https://code.google.com/p/grandcentral/.
	 */
	/**
	 * first block is used create the encrypted value for a text using SimpleCrypto.
	 * Import required will be grandcentral.security.SimpleCrypto
	 */
	/**
	 * Second block is used to find a checksum of a file using SHA-256 encryption
	 */
	/**
	 * Third block is same as first block. Just the algorithm used is MD5 and not
	 * SHA-256
	 */
	/**
	 * Fourth block is same as Second block. Just the algorithm used is MD5 and not
	 * SHA-256 *
	 */
	private static void javaSimpleCryptoForEncryptingUsingGrandCentral() {
//		{
//			SimpleCrypto.setAlgorithm("SHA-256");
//			SimpleCrypto.setPath(null);
//			SimpleCrypto.setText("yourText");
//			System.out.println(new SimpleCrypto().generateDigest());
//		}
//		{
//			SimpleCrypto.setAlgorithm("SHA-256");
//			SimpleCrypto.setPath("D:\\Harsh\\txt.txt");
//			SimpleCrypto.setText(null);
//			System.out.println(new SimpleCrypto().generateChecksum());
//		}
//		{
//			SimpleCrypto.setAlgorithm("MD5");
//			SimpleCrypto.setPath(null);
//			SimpleCrypto.setText("yourText");
//			System.out.println(new SimpleCrypto().generateDigest());
//		}
//		{
//			SimpleCrypto.setAlgorithm("MD5");
//			SimpleCrypto.setPath("D:\\Harsh\\txt.txt");
//			SimpleCrypto.setText(null);
//			System.out.println(new SimpleCrypto().generateChecksum());
//		}
	}

	/**
	 * This method find the files using grandcentral api's. one needs to have
	 * GrandCentral v1.-.jar. download from https://code.google.com/p/grandcentral/
	 * import statement required will be grandcentral.fileutils.Sherlock. File name
	 * returned will be full qualified file name
	 */
	private static void javaFindFilesUsingGrandCentral() {
//		Sherlock.setChecksum(null);
//		Sherlock.setDotFiles(false);
//		Sherlock.setExcludes(null);
//		Sherlock.setIncludes(new String[] { "D:\\temp" });
//		Sherlock.setRecursive(true);
//		for (String foundFiles : new Sherlock().findFiles()) {
//			System.out.println(foundFiles);
//		}
	}

	/**
	 * This method is used to remove large files from the machine at multiple
	 * locations. One needs to use GrandCentral v1.-.jar. Download from
	 * https://code.google.com/p/grandcentral/ import statement is import
	 * grandcentral.fileutils.FileShredder;
	 */
	private static void javaShedFilesUsingGrandCentral() {
//		FileShredder.recursive(false);
//		FileShredder.setExcludes(null);
//		FileShredder.setIncludes(new String[] { "/Users/cristianrivera/Desktop" });
//		FileShredder.shredParent(false);
//		for (String processedFolders : new FileShredder().shredFiles()) {
//			System.out.println(processedFolders);
//		}
	}

	/**
	 * This method is used to encrypt the password using MD5 algorithm. One can use
	 * the java.security package or apache common utility class DigestUtils also.
	 */
	static void javaPasswordSecuredByMD5() {
		String input = "MyPassword123";
		try {

			// Create MessageDigest object for MD5
			MessageDigest digest = MessageDigest.getInstance("MD5");

			// Update input string in message digest
			digest.update(input.getBytes(), 0, input.length());

			// Converts message digest value in base 16 (hex)
			input = new BigInteger(1, digest.digest()).toString(16);

		} catch (NoSuchAlgorithmException e) {

			e.printStackTrace();
		}
		System.out.println("Encrypted password is " + input);
		// you can also use Apache Commons Codec library to covert any string to
		// Md5 hash. The commons-codec.jar contains class
		// org.apache.commons.codec.digest.DigestUtils that can be used to
		// generate MD5 hash.

		// System.out.println(DigestUtils.md5Hex("MyPassword123"));

		// In cryptography, a salt consists of random bits, creating one of the
		// inputs to a one-way function. The other input is usually a password
		// or passphrase. The output of the one-way function can be stored
		// rather than the password, and still be used for authenticating users.
		// The one-way function typically uses a cryptographic hash function.
		String password = "mypassword";
		String salt = "Random$SaltValue#WithSpecialCharacters12@$@4&#%^$*";
		String hash = DigestUtils.md5Hex(password + salt);
		System.out.println(hash);
	}

	/**
	 * This method creates the a string at runtime with the values passed.
	 */
	private static void javaCreatingAStringWithRuntimeValuesUsingFormatMethod() {
		Object floatVar = 10f;
		Object stringVar = "harsh";
		Object intVar = 20;
		String string = String.format("The value of the float variable is " + "%f, while the value of the integer "
				+ "variable is %d, and the string " + "is %s", floatVar, intVar, stringVar);
		System.out.println(string);
		Object strSelectClause = "app_id, app_name";
		Object strWhereClause = "where app_id =?";
		String strQuery = String.format("select %s from application %s", strSelectClause, strWhereClause);
		System.out.println(strQuery);
		System.out.println(String.format("10 / 3 = %.3f", 10.0 / 3.0));
		Date today = new Date();
		System.out.printf("Date in dd/mm/yy format %td/%tm/%ty %n", today, today, today);

		// date as July 25, 2012, difference between %td and %te is that
		// %td use leading zero while %te doesn't
		System.out.printf("Today is %tB %te, %tY %n", today, today, today, today);

		// adding leading zero in numbers using String format,
		// %d is for decimal, 8 specify formatted number should be 8 digit and 0
		// specify use
		// leading zero, default is space, so if you don't specify leading
		// character space will be used.
		System.out.printf("Amount : %08d %n", 221);

		// printing positive and negative number using String format
		// + sign for positive, - for negative and %n is for new line

		System.out.printf("positive number : +%d %n", 1534632142);
		System.out.printf("negative number : -%d %n", 989899);

		// printing floating point number with System.format()
		System.out.printf("%f %n", Math.E);

		// 3 digit after decimal point
		System.out.printf("%.3f %n", Math.E);

		// 8 charcter in width and 3 digit after decimal point
		System.out.printf("%8.3f %n", Math.E);

		// adding comma into long numbers
		System.out.printf("Total %,d messages processed today %n", 10000000);

		String heading1 = "Exam_Name";
		String heading2 = "Exam_Grade";

		System.out.printf("%-15s %15s %n", heading1, heading2);
		System.out.printf("%15s %-15s %n", heading1, heading2);
		System.out.printf("%s %d %n", "testing", 10);
		StringBuilder sb = new StringBuilder();
		// Send all output to the Appendable object sb
		Formatter formatter = new Formatter(sb, Locale.US);

		// Explicit argument indices may be used to re-order output.
		System.out.println(formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d"));
		// -> " d c b a"

		Object args = "Harsh";
		Object args1 = null;
		/*
		 * This method check if the value is null or not. Incase of null false is
		 * returned and in case of not-null true is returned
		 */
		String str = String.format("Value is %B", args);
		System.out.println(str);
		/*
		 * Returns the hex value
		 */
		str = String.format("Value is %H", args);
		System.out.println(str);
		str = String.format("Value is %H", args1);
		System.out.println(str);
		/* returns the unicode character for the passed character O/P=H */
		str = String.format("Value is %C", args.toString().charAt(0));
		System.out.println(str);

		/* Returns the octal value O/P=12 */
		str = String.format("Value is %o", 10);
		System.out.println(str);

		/* Returns the Hexadecimal value O/P=a */
		str = String.format("Value is %x", 10);
		System.out.println(str);

		/*
		 * Returns the decimal number in computerized scientific notation
		 * O/P=1.090000e+01
		 */
		str = String.format("Value is %e", 10.9);
		System.out.println(str);

		/* Returns the decimal number O/P=10.454500 */
		str = String.format("Value is %f", 10.4545);
		System.out.println(str);

		/*
		 * Returns the computerized scientific notation or decimal format, depending on
		 * the precision and the value after rounding. O/P=10.1235
		 */
		str = String.format("Value is %g", 10.1234567);
		System.out.println(str);

		/*
		 * Returns the hour of the day with range 0-12 O/P=<Hour at that time with 0-23
		 * range>
		 */
		str = String.format("Value is %tH", new Date());
		System.out.println(str);

		/*
		 * Returns the hour of the day with range 0-23 O/P=<Hour at that time with range
		 * as 0-12>
		 */
		str = String.format("Value is %tI", new Date());
		System.out.println(str);

		Date d = new Date();
		/*
		 * M=minute of the hour, S for second of the minute, L for milisecond, N for
		 * nanosecond, p for locale specific, z for numeric time zone offset from GMT, B
		 * locale specific full month name, b locale specfic abbrevaited month name,
		 * A,a= locale specific day of week(full and abbrevaited name),
		 */
		str = String.format("Value is %tM %tS %tL %tN %tp %tz %tB %tb %tA, %ta", d, d, d, d, d, d, d, d, d, d);
		System.out.println(str);

		/*
		 * C for four digit year divided by 100, Y for formatted year, y for 2 digit
		 * year number,m for month (0-13), d for day 0-31, e day of month 1-31, R for
		 * 24-hour clock as "%tH:%tM", T for 24-hour clock as "%tH:%tM:%tS", r for
		 * 12-hour clock as "%tI:%tM:%tS %Tp"
		 */
		str = String.format("Value is %tC %tY %ty %tm %td %te %tR %tT %tr", d, d, d, d, d, d, d, d, d, d);
		System.out.println(str);

		/*
		 * Date formatted as "%tm/%td/%ty".
		 */
		str = String.format("Date formatted %tD", d);
		System.out.println(str);

		/*
		 * ISO 8601 complete date formatted as "%tY-%tm-%td".
		 */
		str = String.format("Date formatted %tF", d);
		System.out.println(str);

		/*
		 * Date and time formatted as "%ta %tb %td %tT %tZ %tY", e.g.
		 * "Sun Jul 20 16:17:00 EDT 1969".
		 */
		str = String.format("Date formatted %tc", d);
		System.out.println(str);
		formatter.close();
	}

	/**
	 * This method shows if a number is power of two using three different methods
	 */
	private static void javaCheckPowerOfTwoInJava() {
		int[] numbers = { 0, 1, 2, 6, 8 };
		for (int num : numbers) {
			System.out.println("isPowerOfTwo()-- is " + num + " power of two in Java :" + isPowerOfTwo(num));
			System.out.println("powerOfTwo()-- is " + num + " power of two in Java :" + powerOfTwo(num));
			System.out.println("checkPowerOfTwo()-- is " + num + " power of two in Java :" + checkPowerOfTwo(num));
			System.out.println("-----------------------------------------------------------");
		}
	}

	/*
	 * checking if number is power of 2 using bit shift operator in java e.g. 4 in
	 * binary format is "0000 0000 0000 0000 0000 0000 0000 0100"; and -4 is
	 * "1111 1111 1111 1111 1111 1111 1111 1100"; and 4&-4 will be
	 * "0000 0000 0000 0000 0000 0000 0000 0100"
	 */
	private static boolean isPowerOfTwo(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("number: " + number);
		}
		if ((number & -number) == number) {
			return true;
		}
		return false;
	}

	/*
	 * checking if number is power of 2 using brute force starts with 1, multiplying
	 * with 2 it will eventually be same as original number
	 */
	private static boolean powerOfTwo(int number) {
		int square = 1;
		while (number >= square) {
			if (number == square) {
				return true;
			}
			square = square * 2;
		}
		return false;
	}

	/*
	 * find if an integer number is power of 2 or not using bit shift operator
	 */

	private static boolean checkPowerOfTwo(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("number: " + number);
		}
		return ((number & (number - 1)) == 0);
	}

	/**
	 * This method will receive the HttpResponse from the specified link
	 */
	private static void jspServletReceiveHttpRequestUsingGetPostInJava() {
		System.out.println("This method send the HTTP get Request");
		receiveHttpRequestPostRequestInJava();
		System.out.println("This method send the HTTP post Request");
		receiveHttpRequestGetRequestInJava();
	}

	/**
	 * This method will receive the HttpResponse request using get method in java
	 */
	private static void receiveHttpRequestGetRequestInJava() {
		String url = "http://www.google.com/search?q=httpClient";

		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);
		// add request header
		request.addHeader("User-Agent", "USER_AGENT");
		HttpResponse response;
		try {
			response = client.execute(request);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will receive the HttpResponse request using post method in java
	 */
	private static void receiveHttpRequestPostRequestInJava() {
		String url = "https://selfsolve.apple.com/wcResults.do";

		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);

		// add header
		post.setHeader("User-Agent", "USER_AGENT");

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("sn", "C02G8416DRJM"));
		urlParameters.add(new BasicNameValuePair("cn", ""));
		urlParameters.add(new BasicNameValuePair("locale", ""));
		urlParameters.add(new BasicNameValuePair("caller", ""));
		urlParameters.add(new BasicNameValuePair("num", "12345"));

		try {
			post.setEntity(new UrlEncodedFormEntity(urlParameters));
			HttpResponse response = client.execute(post);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method makes get and post request via HttpURLConnection class.
	 */
	private static void jspServletSendHttpRequestUsingGetPostInJava() {
		System.out.println("Calling using Get Method using HttpsURLConnection class");
		sendGetInJavaUsingHttpsURLConnection();
		System.out.println("Calling using Post Method using HttpsURLConnection class");
		sendPostInJavaUsingHttpsURLConnection();
		System.out.println("Calling using Get Method using Apache HttpClient class");
		sendGetInJavaUsingApacheHttpClient();
		System.out.println("Calling using Post Method using Apache HttpClient class");
		sendPostInJavaUsingApacheHttpClient();
	}

	/**
	 * This method sends the Post request using Apache HttpClient class
	 */
	private static void sendPostInJavaUsingApacheHttpClient() {
		final String USER_AGENT = "Mozilla/5.0";
		String url = "https://selfsolve.apple.com/wcResults.do";

		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);

		// add header
		post.setHeader("User-Agent", USER_AGENT);

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("sn", "C02G8416DRJM"));
		urlParameters.add(new BasicNameValuePair("cn", ""));
		urlParameters.add(new BasicNameValuePair("locale", ""));
		urlParameters.add(new BasicNameValuePair("caller", ""));
		urlParameters.add(new BasicNameValuePair("num", "12345"));

		try {
			post.setEntity(new UrlEncodedFormEntity(urlParameters));
			HttpResponse response = client.execute(post);
			System.out.println("\nSending 'POST' request to URL : " + url);
			System.out.println("Post parameters : " + post.getEntity());
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}

			System.out.println(result.toString());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method sends the Get request using Apache HttpClient class
	 */
	private static void sendGetInJavaUsingApacheHttpClient() {
		final String USER_AGENT = "Mozilla/5.0";
		String url = "http://www.google.com/search?q=developer";

		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(url);

		// add request header
		request.addHeader("User-Agent", USER_AGENT);

		HttpResponse response;
		try {
			response = client.execute(request);

			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}

			System.out.println(result.toString());
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method sends the Post request using HttpsURLConnection class
	 */
	private static void sendPostInJavaUsingHttpsURLConnection() {
		String url = "https://selfsolve.apple.com/wcResults.do";
		final String USER_AGENT = "Mozilla/5.0";
		URL obj;
		try {
			obj = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

			// add reuqest header
			con.setRequestMethod("POST");
			con.setRequestProperty("User-Agent", USER_AGENT);
			con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

			String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";

			// Send post request
			con.setDoOutput(true);
			DataOutputStream wr = new DataOutputStream(con.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'POST' request to URL : " + url);
			System.out.println("Post parameters : " + urlParameters);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method send the Get request using HttpsURLConnection class
	 */
	private static void sendGetInJavaUsingHttpsURLConnection() {
		String url = "http://www.google.com/search?q=mkyong";
		final String USER_AGENT = "Mozilla/5.0";
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			// add request header
			con.setRequestProperty("User-Agent", USER_AGENT);

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * this method will read the file asynchronously. this method requires java7.
	 * One can specify the characters from where the file should be read and then
	 * ending position. "ByteBuffer.allocate(500)" states the characters after
	 * starting and starting character position is defined in
	 * "asyncChannel.read(buffer, 10);". So starting position will be 11th
	 * characters and then 500 characters will be shown.
	 */
	private static void javaNIOReadFileAsynchronously() {
		ByteBuffer buffer = ByteBuffer.allocate(500);

		// The file to read the contents from.
		Path path = Paths.get("C:/Users/C5190459/Documents/txt.txt");

		// Creating the asynchronous channel to the file which allows reading
		// and writing of content.
		try {
			AsynchronousFileChannel asyncChannel = AsynchronousFileChannel.open(path);
			//
			// // Returns a Future instance which can be used to read the
			// contents
			// // of the file.
			Future<Integer> fileResult = asyncChannel.read(buffer, 10);
			//
			// // Waiting for the file reading to complete.
			while (!fileResult.isDone()) {
				System.out.println("Waiting to complete the file reading ...");
			}
			//
			// // Print the number of bytes read.
			System.out.println("Number of bytes read: " + fileResult.get());
			//
			// // Reset the current position of the buffer to the beginning and
			// the
			// // limit to the current position.
			buffer.flip();
			//
			// // Decode the contents of the byte buffer.
			System.out.println("Contents of file: ");
			System.out.println(Charset.defaultCharset().decode(buffer));

		} catch (IOException ex) {// | InterruptedException | ExecutionException ex) {
			ex.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method converts the ArrayList to String with demiliter. This method uses
	 * the Spring framework's class StringUtils. One need to have the spring.jar to
	 * make code compilation error free.
	 */
	private static void javaCollectionToStringWithDelimiterAsComma() {
		// List with multiple Strings for testing
		List<String> frameworks = Arrays.asList("Spring MVC", "Struts 2.0", "Velocity", "Wicket", "Wicket");

		// let's convert this list into comma separated String
		String commaDelimitedString = StringUtils.collectionToCommaDelimitedString(frameworks);
		System.out.println(commaDelimitedString);
		//
		// // list to colon delimited String
		String colonDelimitedString = StringUtils.collectionToDelimitedString(frameworks, ":");
		System.out.println(colonDelimitedString);
		//
		// // List to pipe delimited String
		String pipeDelimitedString = StringUtils.collectionToDelimitedString(frameworks, "|");
		System.out.println(pipeDelimitedString);
		//
		// // Now let's convert Set into String in Java
		HashSet<String> frameworkSet = new HashSet(frameworks);
		//
		// // HashSet to comma separated String
		commaDelimitedString = StringUtils.collectionToCommaDelimitedString(frameworkSet);
		System.out.println(commaDelimitedString);
		//
		// // Set to delimiter separated String using Spring
		colonDelimitedString = StringUtils.collectionToDelimitedString(frameworkSet, ":");
		System.out.println(colonDelimitedString);
		//
		// // Set to pipe delimited String using Spring framework StringUtils
		pipeDelimitedString = StringUtils.collectionToDelimitedString(frameworkSet, "|");
		System.out.println(pipeDelimitedString);

	}

	/**
	 * This method is used to draw an art in Java using Graphics classes
	 */
	public static void javaAsciiArtInJava() {
		int width = 400;
		int height = 30;

		BufferedImage image;
		try {
			image = ImageIO.read(new File("/Users/mkyong/Desktop/logo.jpg"));
			BufferedImage image1 = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			Graphics g = image.getGraphics();
			g.setFont(new Font("SansSerif", Font.BOLD, 24));

			Graphics2D graphics = (Graphics2D) g;
			graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			graphics.drawString("Harsh Bansal", 0, 20);

			// save this image
			ImageIO.write(image, "png", new File("/users/mkyong/ascii-art.png"));

			for (int y = 0; y < height; y++) {
				StringBuilder sb = new StringBuilder();
				for (int x = 0; x < width; x++) {
					sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");
				}

				if (sb.toString().trim().isEmpty()) {
					continue;
				}

				System.out.println(sb);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Can convert the Integer list to int array
	 */
	private static void javaConvertIntgerOfListToPrimitiveInt() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("List of Integers : " + numbers);
		Integer[] integers = numbers.toArray(new Integer[numbers.size()]);

		int[] primitives = ArrayUtils.toPrimitive(integers);
		System.out.println("Array with primitive int : " + Arrays.toString(primitives));
	}

	/**
	 * This method monitors a directory and whenever any file is created,modified or
	 * deleted it publishes the creation of file with file name
	 *
	 * @throws IOException
	 * @throws InterruptedException
	 */
	private static void javaNIOfileWatcher() throws IOException, InterruptedException {
		Path faxFolder = Paths.get("C:\\Harsh\\temp");
		WatchService watchService = FileSystems.getDefault().newWatchService();
		faxFolder.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
				StandardWatchEventKinds.ENTRY_MODIFY);

		boolean valid = true;
		do {
			WatchKey watchKey = watchService.take();

			for (WatchEvent<?> event : watchKey.pollEvents()) {
				WatchEvent.Kind kind = event.kind();
				if (StandardWatchEventKinds.ENTRY_CREATE.equals(event.kind())) {
					String fileName = event.context().toString();
					System.out.println("File Created:" + fileName);
				} else if (StandardWatchEventKinds.ENTRY_DELETE.equals(event.kind())) {
					String fileName = event.context().toString();
					System.out.println("File Deleted:" + fileName);
				} else if (StandardWatchEventKinds.ENTRY_MODIFY.equals(event.kind())) {
					String fileName = event.context().toString();
					System.out.println("File Modified:" + fileName);
				}
			}
			// valid = watchKey.reset();
		} while (valid);
	}

	/**
	 * This method provide the list of countries by their own language which are
	 * present in Java
	 */
	private static void javaListOfCountriesInOwnLanguage() {
		Map<String, String> languagesMap = new TreeMap<String, String>();
		Locale[] locales = Locale.getAvailableLocales();

		for (Locale obj : locales) {
			if ((obj.getDisplayCountry() != null) && (!"".equals(obj.getDisplayCountry()))) {
				languagesMap.put(obj.getCountry(), obj.getLanguage());
			}
		}
		String[] countries = Locale.getISOCountries();
		int supportedLocale = 0, nonSupportedLocale = 0;
		for (String countryCode : countries) {
			Locale obj = null;
			if (languagesMap.get(countryCode) == null) {
				obj = new Locale("", countryCode);
				nonSupportedLocale++;
			} else {
				// create a Locale with own country's languages
				obj = new Locale(languagesMap.get(countryCode), countryCode);
				supportedLocale++;
			}
			System.out.println("Country Code = " + obj.getCountry() + ", Country Name = " + obj.getDisplayCountry(obj)
					+ ", Languages = " + obj.getDisplayLanguage());
		}
		System.out.println("nonSupportedLocale : " + nonSupportedLocale);
		System.out.println("supportedLocale : " + supportedLocale);
	}

	/**
	 * This method provide the list of countries by language which are present in
	 * Java
	 *
	 * @param locale
	 */
	private static void javaListOfCountriesByLanguage(Locale locale) {
		String[] locales = Locale.getISOCountries();

		for (String countryCode : locales) {
			Locale obj = new Locale("", countryCode);
			System.out.println(
					"Country Code = " + obj.getCountry() + ", Country Name = " + obj.getDisplayCountry(locale));

		}
	}

	/**
	 * This method provide the list of countries which are present in Java
	 */
	private static void javaListOfCountries() {
		String[] locales = Locale.getISOCountries();

		for (String countryCode : locales) {
			Locale obj = new Locale("", countryCode);
			System.out.println("Country Code = " + obj.getCountry() + ", Country Name = " + obj.getDisplayCountry());

		}
	}

	/**
	 * This method provide the minutes after which energy will be full in Criminal
	 * Case application in Facebook
	 */
	private static void gameWaitTimeForCriminalCase() {
		int lifeNow = 0;
		System.out.println("Provide the Energy as of now");
		Scanner inputReader = new Scanner(System.in);
		lifeNow = inputReader.nextInt();
		Calendar cal = Calendar.getInstance();
		int timeFull = (110 - lifeNow) * 200000;
		System.out.println("Time Right now " + cal.getTime());
		System.out.println("Time when you will have 110 energy \n" + new Date((cal.getTimeInMillis() + timeFull)));
		inputReader.close();

	}

	/**
	 * This method will call the private field and methods in any class.
	 */
	private static void javaReflectioncallingPrivateFieldsAndMethods() {
		Class<AllJavaCode> person;
		try {
			person = (Class<AllJavaCode>) Class.forName("util.AllJavaCode");

			// getFields() does not return private field
			System.out.println("Fields : " + Arrays.toString(person.getFields()));

			// getDeclaredFields() return both private and non private fields
			// using
			// reflection
			System.out.println("Declared Fields : " + Arrays.toString(person.getDeclaredFields()));

			// getDeclaredMethods() return both private and non private methods
			// using reflection
			System.out.println("Declared methods : " + Arrays.toString(person.getDeclaredMethods()));

			// accessing value of private field using reflection in Java
			AllJavaCode privateRyan = new AllJavaCode();
			Field privateField = person.getDeclaredField("serialVersionUID");

			// this call allows private fields to be accessed via reflection
			privateField.setAccessible(true);

			// getting value of private field using reflection
			Long value = (Long) privateField.get(privateRyan);

			// print value of private field using reflection
			System.out.println("private field: " + privateField + " value: " + value);

			// accessing private method using reflection
			Method privateMethod = person.getDeclaredMethod("findFilesInDirectories");

			// making private method accessible using reflection
			privateMethod.setAccessible(true);

			// calling private method using reflection in java
			privateMethod.invoke(privateRyan);

		} catch (InvocationTargetException ex) {
		} catch (NoSuchMethodException ex) {
		} catch (IllegalArgumentException ex) {
		} catch (IllegalAccessException ex) {
		} catch (NoSuchFieldException ex) {
		} catch (SecurityException ex) {
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method uses the move method from Files class in Java 7
	 */
	private static void javaNIOfileMoveIn() {
		// Define the source and target of the file to be moved.
		Path source = Paths.get("D:\\Source\\data.txt");
		Path target = Paths.get("D:\\Backup\\data.txt");

		try {
			// Move file from source to target using the defined configuration
			// (REPLACE_EXISTING)
			Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method checks the file in particular directory with particular format.
	 * In java 7 we can use try with rsource to close the stream object using try
	 * (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.txt")) {
	 */
	private static void javaNIOfindFilesInDirectories() {
		Path dir = Paths.get("C:\\Harsh\\temp");
		try {
			DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.png");
			System.out.println(stream.toString());
			for (Path entry : stream) {
				System.out.println(entry.getFileName());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * This method shows the download code from the http server and https server
	 */
	private static void jsServletdownloadFileFromHttpAndHttps() {
		URL url = null;
		URLConnection con = null;
		int i;
		BufferedOutputStream bos = null;
		try {
			url = new URL("https://localhost:8080/AppName/FileName.txt");
			con = url.openConnection();
			File file = new File("C:\\Foldername\\Address.txt");
			BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
			bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
			bos.flush();
			bis.close();
		} catch (MalformedInputException malformedInputException) {
			malformedInputException.printStackTrace();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		} finally {
			try {
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/*
		 * For Https we have to add the following snippet to work
		 */
		System.setProperty("java.protocol.handler.pkgs", "com.sun.net.ssl.internal.www.protocol");
		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

	}

	/**
	 * Simple example of json object in java. import net.sf.json.JSONObject; needs
	 * to be imported.
	 */
	private static void javaJsonExample() {
		JSONObject json = new JSONObject();
		try {
			json.put("id", "111");
			json.put("name", "JSON Example");
			json.put("value", "JSON Object");
			System.out.println(json);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will remove any non ASCII characters which may be present in
	 * String
	 */
	private static void javaStringRemoveNonASCIICharacters() {
		String str = "Th� qu�ck br�wn f�x jumps over the l�zy d�g.";
		System.out.println("str = " + str);

		// Replace all non ascii chars in the string.
		str = str.replaceAll("[^\\x0A\\x0D\\x20-\\x7E]", "");
		System.out.println("str = " + str);
	}

	/**
	 * This method help in reteriving the response header details
	 */
	private static void jspServletGetResponseHeaderDetails() {
		try {
			URL obj = new URL("http://mkyong.com");
			URLConnection conn = obj.openConnection();
			Map<String, List<String>> map = conn.getHeaderFields();
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				System.out.println("Key : " + entry.getKey() + " ,Value : " + entry.getValue());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will provide all the details of user who has logged into the
	 * system. org.springframework.security.core.Authentication has the methods
	 * getAuthorities, getCredentials, getDetails, getPrincipal and getName. The
	 * last method getName is used for fetching the user name.
	 */
	private static void springGetUserDetails() {
		// Object principal = SecurityContextHolder.getContext()
		// .getAuthentication().getPrincipal();
		// if (principal instanceof UserDetails) {
		// String username = ((UserDetails) principal).getUsername();
		// } else {
		// String username = principal.toString();
		// }
	}

	/**
	 * This method verify the digital signature of the previously signed data. To
	 * sign the data you can see the previous example on this post How to create a
	 * digital signature and sign data?.
	 */
	private static void javaVerifyDigitalSignatureOfSignedData() {
		try {
			byte[] publicKeyEncoded = Files.readAllBytes(Paths.get("publickey"));
			byte[] digitalSignature = Files.readAllBytes(Paths.get("signature"));

			X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyEncoded);
			KeyFactory keyFactory = KeyFactory.getInstance("DSA", "SUN");

			PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);
			Signature signature = Signature.getInstance("SHA1withDSA", "SUN");
			signature.initVerify(publicKey);

			byte[] bytes = Files.readAllBytes(Paths.get("README"));
			signature.update(bytes);

			boolean verified = signature.verify(digitalSignature);
			if (verified) {
				System.out.println("Data verified.");
			} else {
				System.out.println("Cannot verify data.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method deletes the duplicates from the ArrayList. There are two ways of
	 * performing that operation
	 */
	private static void javaDeleteDuplicateFromArrayList() {
		// ArrayList with duplicates String
		List<String> duplicateList = (List<String>) Arrays.asList("Android", "Android", "iOS", "Windows mobile");
		System.out.println("size of Arraylist with duplicates: " + duplicateList.size()); // should print 4 because of
																							// duplicates
		// Android

		System.out.println(duplicateList);
		// Converting ArrayList to HashSet to remove duplicates
		HashSet<String> listToSet = new HashSet<String>(duplicateList);

		// Creating Arraylist without duplicate values
		List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
		System.out.println("size of ArrayList without duplicates: " + listToSet.size()); // should print 3 because of
																							// duplicates
		// Android removed
		System.out.println(listWithoutDuplicates);

		// Output:
		// size of Arraylist with duplicates: 4
		// [Android, Android, iOS, Windows mobile]
		// size of ArrayList without duplicates: 3
		// [Android, Windows mobile, iOS]

		duplicateList = (List<String>) Arrays.asList("Android", "Android", "iOS", "Windows mobile");

		// should print 4 becaues of duplicates Android
		System.out.println("size of Arraylist with duplicates: " + duplicateList.size());
		System.out.println("ArrayList with duplicates: " + duplicateList);

		// Converting ArrayList to HashSet to remove duplicates
		listToSet = new LinkedHashSet<String>(duplicateList);

		// Creating Arraylist without duplicate values
		listWithoutDuplicates = new ArrayList<String>(listToSet);

		// should print 3 becaues of duplicates Android removed
		System.out.println("size of ArrayList without duplicates: " + listToSet.size());
		System.out.println("ArrayList after removing duplicates in same order: " + listWithoutDuplicates);
		// Output:
		// size of Arraylist with duplicates: 4
		// ArrayList with duplicates: [Android, Android, iOS, Windows mobile]
		// size of ArrayList without duplicates: 3
		// ArrayList after removing duplicates in same order: [Android, iOS,
		// Windows mobile]

	}

	/**
	 * Creates a XML from properties file
	 *
	 * @throws IOException
	 */
	private static void javaCreateXMLfileByPropertiesClass() throws IOException {
		// Reading properties files in Java example
		Properties props = new Properties();
		FileOutputStream fos = new FileOutputStream("c:/user.xml");

		props.setProperty("key1", "value1");
		props.setProperty("key2", "value2");

		// writing properites into properties file from Java
		props.storeToXML(fos, "Properties file in xml format generated from Java program");
		fos.close();
	}

	/**
	 * this method creates Properties file
	 *
	 * @throws IOException
	 */
	private static void javaCreatePropertiesFile() throws IOException {
		Properties props = new Properties();
		FileOutputStream fos = new FileOutputStream("c:/user.properties");

		props.setProperty("key1", "value1");
		props.setProperty("key2", "value2");

		// writing properites into properties file from Java
		props.store(fos, "Properties file generated from Java program");

		fos.close();
	}

	/**
	 * This method is used to find out if date in String is valid or not against a
	 * set of date formats.
	 */
	private static void javaCheckStringIsDate() {
		List<SimpleDateFormat> dateFormats = new ArrayList<SimpleDateFormat>() {
			/**
			 * serialVersionUID
			 */
			private static final long serialVersionUID = 7862412433690271908L;

			{
				add(new SimpleDateFormat("M/dd/yyyy"));
				add(new SimpleDateFormat("dd.M.yyyy"));
				add(new SimpleDateFormat("M/dd/yyyy hh:mm:ss a"));
				add(new SimpleDateFormat("dd.M.yyyy hh:mm:ss a"));
				add(new SimpleDateFormat("dd.MMM.yyyy"));
				add(new SimpleDateFormat("dd-MMM-yyyy"));
			}
		};

		String input = "09/09/2010";
		/*
		 * POssible values can be 10/14/2012, 10-Jan-12, 01.03.2002, 12/3/2010,
		 * 19.Feb.2011, 4/20/2012 , 123456, null
		 */
		Date date = null;
		for (SimpleDateFormat format : dateFormats) {
			try {
				date = format.parse(input);
			} catch (ParseException e) {
				// Shhh.. try other formats
			}
			if (date != null) {
				break;
			}
		}
		System.out.println(date);
	}

	/**
	 * This method splits the string with multiple tokens. split method of string
	 * doesn't work here. hence we have to use StringTokenizer class
	 */
	private static void javaStringSplitTokenizerWithMultipleregex() {
		String tokenString = "Tokenizer delimiter:with Multiple/Single'String";
		String[] str = tokenString.split(" :/");
		for (String string : str) {
			System.out.println(string);
		}
		StringTokenizer st = new StringTokenizer(tokenString, " :/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

	/**
	 * This method will call the Javascript from Java. Apache commons provides a
	 * project Jakarta Bean Scripting Framework (BSF) which gives implementation for
	 * a several set of scripting languages like Python, TCL, NetRexx including
	 * javascript and lot more.
	 */
	private static void javascriptRunFromJava() {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("javascript");

		try {
			engine.eval("var x = 10;");
			engine.eval("var y = 20;");
			engine.eval("var z = x + y;");
			engine.eval("print (z);");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method help to take the input by console and java applet from the user.
	 * Also we can directly get the input in int and float
	 */
	private static void javaReadUserInputConsoleJOptionPanel() {
		// Java Exmaple to get input from user from command prompt
		System.out.println("Please enter input from command prompt: ");
		Scanner inputReader = new Scanner(System.in);

		// Getting input in String format
		String name = inputReader.nextLine();
		System.out.println("Hi " + name);

		// Getting number as input from command line in Java
		System.out.println("Please enter a number from command line? ");
		int number = inputReader.nextInt();
		System.out.println("You have entered : " + number);

		// Getting floating point as input from command line in Java
		System.out.println("Please enter a floating point number from command line? ");
		float decimal = inputReader.nextFloat();
		System.out.println("You have entered : " + decimal);

		// Java Example to get input from user using GUI
		String input = JOptionPane.showInputDialog("Enter any number of your choice");
		System.out.println("User has entered: " + input);
		inputReader.close();
	}

	/**
	 * This method is used to load an jar at runtime pass the class name should be
	 * provided and then the jars
	 */
	private static void javaSystemLoadJarAtRunTime() {
		try {
			System.out.println("Trying to load the class...");
			Class.forName("AllJavaCode");
		} catch (Exception ex) {
			System.out.println("Not able to load class...");
		}
		URLClassLoader cl = null;
		try {
			String url = "jar:file:/" + "" + "!/";
			URL urls[] = { new URL(url) };
			/** This needs to be removed */
			cl = new URLClassLoader(urls, AllJavaCode.class.getClassLoader());
			System.out.println("Looking into jar... " + url);
			cl.loadClass("AllJavaCode");
			System.out.println("Woohoo....I found it");
		} catch (Exception ex) {
			System.out.println("Oops...Still cant find the jar");
			ex.printStackTrace();
		} finally {
			try {
				cl.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * This method calls an external command
	 */
	private static void javaSystemCallProcessOrCommand() {
		ProcessBuilder pb = new ProcessBuilder();
		// This call will have all the environment key value pair
		Map env = pb.environment();
		System.out.println(env);
		// Usual way to display all the environment variables
		System.out.println(System.getenv());

		// Following can be used in Java 1.7 as following methods are not
		// present before that version
		ProcessBuilder dirProcess = new ProcessBuilder("cmd");
		File commands = new File("C:/process/commands.bat");
		File dirOut = new File("C:/process/out.txt");
		File dirErr = new File("C:/process/err.txt");
		dirProcess.redirectInput(commands);
		dirProcess.redirectOutput(dirOut);
		dirProcess.redirectError(dirErr);

		try {
			dirProcess.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param fileName
	 *            Read the XML and there node. Please check the method for the XMl
	 *            which is used to read. Also following imports are required import
	 *            java.io.File; import javax.xml.parsers.DocumentBuilder; import
	 *            javax.xml.parsers.DocumentBuilderFactory; import
	 *            org.w3c.dom.Document; import org.w3c.dom.Element; import
	 *            org.w3c.dom.Node; import org.w3c.dom.NodeList;
	 */
	private static void javaXMLReadNode(String fileName) {

		// <?xml version="1.0"?>
		// <students>
		// <student>
		// <name>John</name>
		// <grade>B</grade>
		// <age>12</age>
		// </student>
		// <student>
		// <name>Mary</name>
		// <grade>A</grade>
		// <age>11</age>
		// </student>
		// <student>
		// <name>Simon</name>
		// <grade>A</grade>
		// <age>18</age>
		// </student>
		// </students>
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			File file = new File(fileName);
			if (file.exists()) {
				Document doc = db.parse(file);
				Element docEle = doc.getDocumentElement();

				// Print root element of the document
				System.out.println("Root element of the document: " + docEle.getNodeName());
				NodeList studentList = docEle.getElementsByTagName("url");

				// Print total student elements in document
				System.out.println("Total students: " + studentList.getLength());

				if (studentList != null && studentList.getLength() > 0) {
					for (int i = 0; i < studentList.getLength(); i++) {

						Node node = studentList.item(i);
						System.out.println(node.getFirstChild());
						try {
							if (node.getNodeType() == Node.ELEMENT_NODE) {
								Element e = (Element) node;
								NodeList nodeList = e.getElementsByTagName("name");
								System.out.println("Name: " + nodeList.item(0).getChildNodes().item(0).getNodeValue());

								nodeList = e.getElementsByTagName("grade");
								System.out.println("Grade: " + nodeList.item(0).getChildNodes().item(0).getNodeValue());

								nodeList = e.getElementsByTagName("age");
								System.out.println("Age: " + nodeList.item(0).getChildNodes().item(0).getNodeValue());
							}
						} catch (NullPointerException e) {
						}
					}
				} else {
					System.exit(1);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * This method protect the pdf by providing the password Before we get started
	 * with code, we need few JAR files. iText internally uses bouncycastle.org
	 * library to encrypt the PDF files. We will need following JAR files in
	 * addition to iText JAR. itextpdf-5.2.1.jar bcmail-jdk16-1.46.jar
	 * bcprov-jdk16-1.46.jar bctsp-jdk16-1.46.jar
	 */
	private static void javaPDFPasswordProtect() {
		OutputStream file;
		try {
			file = new FileOutputStream(new File("C:\\Harsh\\Personal\\temp\\Test.pdf"));
			String USER_PASS = "Hello123";
			String OWNER_PASS = "Owner123";
			com.itextpdf.text.Document document = new com.itextpdf.text.Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);

			writer.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(), PdfWriter.ALLOW_PRINTING,
					PdfWriter.ENCRYPTION_AES_128);

			document.open();
			document.add(new Paragraph("Hello World, iText"));
			document.add(new Paragraph(new Date().toString()));
			document.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method converts the collection to string and back. But this uses the api
	 * of Spring. you need to have Spring jar in the classpath. As spring jar is not
	 * present method is commented import org.springframework.util.StringUtils;
	 */
	private static void javaCollectionToStringWithSpringAndBack() {
		// List with multiple Strings for testing
		List<String> frameworks = Arrays.asList("Spring MVC", "Struts 2.0", "Velocity", "Wicket");

		// let's convert this list into comma separated String
		String commaDelimitedString = StringUtils.collectionToCommaDelimitedString(frameworks);
		System.out.println(commaDelimitedString);
		// // list to colon delimited String
		String colonDelimitedString = StringUtils.collectionToDelimitedString(frameworks, ":");
		System.out.println(colonDelimitedString);

		// // List to pipe delimited String
		String pipeDelimitedString = StringUtils.collectionToDelimitedString(frameworks, "|");
		System.out.println(pipeDelimitedString);

		// // Now let's convert Set into String in Java
		HashSet<String> frameworkSet = new HashSet(frameworks);

		// // HashSet to comma separated String
		commaDelimitedString = StringUtils.collectionToCommaDelimitedString(frameworkSet);
		System.out.println(commaDelimitedString);

		// // Set to delimiter separated String using Spring
		colonDelimitedString = StringUtils.collectionToDelimitedString(frameworkSet, ":");
		System.out.println(colonDelimitedString);
		// // Set to pipe delimited String using Spring framework StringUtils
		pipeDelimitedString = StringUtils.collectionToDelimitedString(frameworkSet, "|");
		System.out.println(pipeDelimitedString);

		// Output
		// Spring MVC,Struts 2.0,Velocity,Wicket
		// Spring MVC:Struts 2.0:Velocity:Wicket
		// Spring MVC|Struts 2.0|Velocity|Wicket
		// Struts 2.0,Spring MVC,Velocity,Wicket
		// Struts 2.0:Spring MVC:Velocity:Wicket
		// Struts 2.0|Spring MVC|Velocity|Wicket
	}

	/**
	 * This method shows how to call private constructor
	 */
	private static void javaReflectionCallingPrivateConstructor() {
		Constructor c[] = AllJavaCode.class.getDeclaredConstructors();
		c[0].setAccessible(true);
		try {
			c[0].newInstance(null);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method formats the string
	 */
	private static void javaStringFormat() {
		String s1 = "Core";
		String s2 = "Java";
		int n = 10;
		// common meta characters used in String.format() and
		// System.out.printf() method: %s - String , %d - decimal integer
		// %f - float %tD - date as MM/dd/yy while %td is day %tm is month
		// and %ty is 2 digit year while %tY is four digit year
		System.out.println(String.format("%s and %s and %s and %d", s1, s2, s1, n));
		// Formatting date in String format method - date in MM/dd/yy
		String str = String.format("Today is %tD", new Date());
		System.out.println(str);
		System.out.println("Today is " + new Date());
		Date today = new Date();
		System.out.printf("Date in dd/mm/yy format %td/%tm/%ty %n", today, today, today);

		// date as July 25, 2012, difference between %td and %te is that
		// %td use leading zero while %te doesn't
		System.out.printf("Today is %tB %te, %tY %n", today, today, today, today);
		// adding leading zero in numbers using String format,
		// %d is for decimal, 8 specify formatted number should be 8 digit and 0
		// specify use
		// leading zero, default is space, so if you don't specify leading
		// character space will be used.
		System.out.printf("Amount : %08d %n", 221);
		System.out.printf("Amount : %05d %n", 221);
		// printing positive and negative number using String format
		// + sign for positive, - for negative and %n is for new line

		System.out.printf("positive number : +%d %n", 1534632142);
		System.out.printf("negative number : -%d %n", 989899);

		// printing floating point number with System.format()
		System.out.printf("%f %n", Math.E);

		// 3 digit after decimal point
		System.out.printf("%.3f %n", Math.E);

		// 8 charcter in width and 3 digit after decimal point
		System.out.printf("%8.3f %n", Math.E);

		// adding comma into long numbers
		System.out.printf("Total %,d messages processed today", 10000000);
		System.out.println();
		float floatFormat = 45.39f;
		int intFormat = 123;
		String stringFormat = "String Format";
		String formatstring;
		formatstring = String.format(
				"the float format is %f.\n" + "the integer format is %d.\n" + "the string format is %s", floatFormat,
				intFormat, stringFormat);
		System.out.println(formatstring);
	}

	/**
	 * This method helps to copy the setter and getters from one DTO to another.
	 * This can be very helpful if we have 100 properties and each should be copied
	 * to another DTO. This reduces many lines of code.
	 */
	private static void javaCopyParameterFromOneClassToAnother() {
		Person1 person = new Person1();
		person.setAge(15);
		person.setName("rene");
		OtherPerson othePerson = new OtherPerson();
		System.out.println("Before reflection");
		System.out.println(person.getAge());
		System.out.println(person.getName());

		System.out.println(othePerson.getAge());
		System.out.println(othePerson.getName());
		System.out.println("After reflection***************************************");
		try {
			BeanUtils.copyProperties(othePerson, person);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		System.out.println("Person=====");
		System.out.println(person.getAge());
		System.out.println(person.getName());

		System.out.println("othePerson======");
		System.out.println(othePerson.getAge());
		System.out.println(othePerson.getName());
	}

	/**
	 * This method is used to get the zip code or changed the format of integer as
	 * per the decimal format.
	 */
	private static void javaGetFormatZipCode() {
		int zip = 123;
		DecimalFormat format = new DecimalFormat("00000");
		System.out.println(format.format(zip));
		format = new DecimalFormat("00000.00");
		System.out.println(format.format(zip));
	}

	/**
	 * This method can be used to download a webpage without images or external
	 * resources. You need to provide the link and the location where that webpage
	 * needs to be downloaded. For this code to work, machine should be connected to
	 * internet otherwise java.net.UnknownHostException exception is thrown
	 */
	private static void javaIOGetURLContent() {
		URL url;
		try {
			// get URL content
			url = new URL("http://www.mkyong.com");
			URLConnection conn = url.openConnection();

			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;

			// save to this filename
			String fileName = "C:/Harsh/Project/test.html";
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}

			// use FileWriter to write file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			while ((inputLine = br.readLine()) != null) {
				bw.write(inputLine);
			}
			bw.close();
			br.close();
			System.out.println("Done");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to read the property from a xml file.
	 *
	 * @throws IOException
	 * @throws InvalidPropertiesFormatException
	 */
	private static void javaReadPropertiesFromXML() throws InvalidPropertiesFormatException, IOException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("c:/properties.xml");

		// loading properites from properties file
		props.loadFromXML(fis);

		// reading proeprty
		String username = props.getProperty("jdbc.username");
		System.out.println("jdbc.username: " + username);
	}

	/**
	 * This method is used to convert the PNG to JPG image.
	 */
	private static void javaConvertPngToJpeg() {
		BufferedImage bufferedImage;
		// read image file
		try {
			bufferedImage = ImageIO.read(new File("C:/Harsh/temp/File.PNG"));

			// create a blank, RGB, same width and height, and a white
			// background
			BufferedImage newBufferedImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(),
					BufferedImage.TYPE_INT_RGB);
			newBufferedImage.createGraphics().drawImage(bufferedImage, 0, 0, Color.WHITE, null);

			// write to jpeg file
			ImageIO.write(newBufferedImage, "jpg", new File("C:/Harsh/temp/File.jpg"));
			System.out.println("After successful convesion");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Conversion Failed");
		}
		System.out.println("Done");
	}

	/**
	 * This method is used to check the regrex. I have commented different types of
	 * regrex that can be used.
	 */
	private static void javaRegexCheck() {
		String regularExpression = "[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}";
		regularExpression = "^[0-9]*$";
		regularExpression = "^\\\\d{1,9}$";
		regularExpression = "^\\\\d{0,9}$";
		regularExpression = "^[a-zA-Z0-9 ]+$";
		regularExpression = "^\\\\d*$";
		regularExpression = "^$|[a-zA-Z0-9]+$";
		// regularExpression="[a-zA-Z\s]+[a-zA-Z]+$";
		// regularExpression="^$|[a-zA-Z\s]+[a-zA-Z]+$";
		regularExpression = "^[0-9]{5}$";
		regularExpression = "[a-zA-Z ]*$";
		regularExpression = "^\\\\+[0-9]{2,30}$";
		regularExpression = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		regularExpression = "^[A-Z \\']+$";
		regularExpression = "^[0-9A-Z,\\./ \\']+$";
		regularExpression = "^$|[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}";
		regularExpression = "^[0-9]+$";
		regularExpression = "^[A-Z ,\\.\\']+$";
		regularExpression = "^[A-Z0-9 ,/\\.\\']+$";
		// regrex =
		// "^[_A-Za-z0-9-\+]+(\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\.[A-Za-z0-9]+)*(\.[A-Za-z]{2,})$";
		String regex = ".*[^0-9].*"; // for a string with or without decimal
		regex = ".*\\D.*"; // for a string with or without decimal
		regex = "\\d\\d\\d\\d\\d\\d"; // String with six digits
		regex = "\\d{6}"; // String with six digits
		regex = ".*\\D.*"; // for a string with or without decimal
		regex = ".*\\D.*"; // for a string with or without decimal
		regex = "^[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"; // For
																		// domain
																		// name
																		// verification.
		regex = "^[([0-9]{3}[A-Za-z0-9]{4}[W,X,Y]{1}[A-Za-z0-9]{1})*$]+[([A-Za-z0-9]{2})]*$";
		CharSequence inputVariable = "987abcdW8ahk";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(inputVariable);

		if (m.matches()) {
			System.out.println(m.toString());
			System.out.println("Matched");
		} else {
			System.out.println("No match");
		}
	}

	/**
	 * This method shows how to used the batch functionality of JDBC.
	 */
	private static void jdbcBatchProcess() {
		String[] queries = { "insert into employee (name, city, phone) values ('A', 'X', '123')",
				"insert into employee (name, city, phone) values ('B', 'Y', '234')",
				"insert into employee (name, city, phone) values ('C', 'Z', '345')", };
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("");
			Statement statemenet = connection.createStatement();
			for (String query : queries) {
				statemenet.addBatch(query);
			}
			statemenet.executeBatch();
			statemenet.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// queries are when data is taken dynamically
		Statement statemenet;
		try {
			statemenet = connection.createStatement();
			// Employee employees = new Employee();
			// for (Employee employee : employees) {
			// String query = "insert into employee (name, city) values('" +
			// employee.getName() + "','" +
			// employee.getCity
			// + "')";
			// statemenet.addBatch(query);
			// }
			statemenet.executeBatch();
			statemenet.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Note how we are creating query dynamically using data from Employee
		// object and adding it in batch to insert in one go. Perfect! isn�t it?
		// wait.. You must be thinking what about SQL Injection? Creating
		// queries like this dynamically is very prone to SQL injection. And
		// also the insert query has to be compiled each time.
		// Why not to use PreparedStatement instead of simple Statement. Yes,
		// that can be the solution. Check out the below SQL Injection Safe
		// Batch.

		// String sql =
		// "insert into employee (name, city, phone) values (?, ?, ?)";
		// PreparedStatement ps = connection.prepareStatement(sql);
		// for (Employee employee : employees) {
		// ps.setString(1, employee.getName());
		// ps.setString(2, employee.getCity());
		// ps.setString(3, employee.getPhone());
		// ps.addBatch();
		// }
		// ps.executeBatch();
		// ps.close();
		// connection.close();

		// Still there is one problem with this solution. Consider a scenario
		// where you want to insert half million records into database using
		// batch. Well, that may generate OutOfMemoryError:
		// String sql =
		// "insert into employee (name, city, phone) values (?, ?, ?)";
		// PreparedStatement ps = connection.prepareStatement(sql);
		// final int batchSize = 1000;
		// int count = 0;
		// for (Employee employee : employees) {
		// ps.setString(1, employee.getName());
		// ps.setString(2, employee.getCity());
		// ps.setString(3, employee.getPhone());
		// ps.addBatch();
		// if (++count % batchSize == 0) {
		// ps.executeBatch();
		// }
		// }
		// ps.executeBatch(); // insert remaining records ps.close();
		// // connection.close();
	}

	/**
	 * This method converts the char to String
	 */
	private static void javaCharToString() {
		char ch = 'U';

		// char to string using Character class
		String charToString = Character.toString(ch);
		System.out.println("Converting Char to String using Character class: " + charToString);

		// char to String using String concatenation
		String str = "" + ch;
		System.out.println("Converting Char to String using String concatenation: " + str);

		// char to String using anonymous array
		String fromChar = new String(new char[] { ch });
		System.out.println("Converting Char to String using anonymous array: " + fromChar);

		// char to String using String valueOf
		String valueOfchar = String.valueOf(ch);
		System.out.println("Converting Char to String using String valueOf: " + valueOfchar);
	}

	/*
	 * 1) brute force method which compares each element of Array to all other
	 * elements and return true if it founds duplicates. Though this is not an
	 * efficient choice it is the one which first comes in mind. 2) Another quick
	 * way of checking if a Java array contains duplicates or not is to convert that
	 * array into Set. Since Set doesn�t allow duplicates size of corresponding Set
	 * will be smaller than original Array if Array contains duplicates otherwise
	 * size of both Array and Set will be same. 3) One more way to detect
	 * duplication in java array is adding every element of array into HashSet which
	 * is a Set implementation. Since add(Object obj) method of Set returns false if
	 * Set already contains element to be added, it can be used to find out if array
	 * contains duplicates in Java or not
	 */
	private static void javaCheckDuplicatesInJavaArray() {
		String[] withDuplicates = new String[] { "one", "two", "three", "one" };
		String[] withoutDuplicates = new String[] { "one", "two", "three" };

		System.out.println("Checking array with duplicate using bruteforce: " + bruteforce(withDuplicates));
		System.out.println("Checking array without any duplicate using bruteforce: " + bruteforce(withoutDuplicates));

		System.out
				.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingSet(withDuplicates));
		System.out.println("Checking array without any duplicate using Set and List: "
				+ checkDuplicateUsingSet(withoutDuplicates));

		System.out
				.println("Checking array with duplicate using Set and List: " + checkDuplicateUsingAdd(withDuplicates));
		System.out.println("Checking array without any duplicate using Set and List: "
				+ checkDuplicateUsingAdd(withoutDuplicates));
	}

	/*
	 * brute force way of checking if array contains duplicates in Java comparing
	 * each elements to all other elements of array complexity on order of O(n^2)
	 * not advised in production
	 */
	public static boolean bruteforce(String[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i].equals(input[j]) && i != j) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * detect duplicate in array by comparing size of List and Set since Set doesn't
	 * contain duplicate, size must be less for an arry which contains duplicates
	 */
	public static boolean checkDuplicateUsingSet(String[] input) {
		List<String> inputList = Arrays.asList(input);
		Set<String> inputSet = new HashSet<String>(inputList);
		if (inputSet.size() == inputList.size()) {
			return true;
		}
		return false;
	}

	/*
	 * Since Set doesn't allow duplicates add() return false if we try to add
	 * duplicates into Set and this property can be used to check if array contains
	 * duplicates in Java
	 */
	public static boolean checkDuplicateUsingAdd(String[] input) {
		Set<String> tempSet = new HashSet<String>();
		for (String str : input) {
			if (!tempSet.add(str)) {
				return true;
			}
		}
		return false;
	}

	public static List javaGetUniqueValue4mExcel(String strFileNmFull) {
		List alUnique = null;
		try {
			POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(strFileNmFull));
			HSSFWorkbook wb = new HSSFWorkbook(fs);
			HSSFSheet sheet = wb.getSheetAt(0);
			Set<String> alRecords = new TreeSet<String>();
			alUnique = new ArrayList<Object>();
			int rows = 0;
			rows = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Total Records are " + (rows - 1));
			int cols = 0;
			// No of columns int tmp = 0; // // This trick ensures that we get
			// the data properly even if it // doesn't
			// start from first few rows
			for (int i = 1; (i <= 10) || (i < rows); i++) {
				HSSFRow row = sheet.getRow(i);
				if (row != null) {
					int tmp = sheet.getRow(i).getPhysicalNumberOfCells();
					if (tmp > cols) {
						cols = tmp;
					}
				}
			}
			for (int r = 1; r <= rows; r++) {
				HSSFRow row = sheet.getRow(r);
				if (row != null) {
					for (int c = 0; c < cols; c++) {
						HSSFCell cell = row.getCell((short) c);
						if (cell != null) {
							alRecords.add(cell.getStringCellValue());
						}
					}
				}
			}
			System.out.println("Sorted Values are as follows");
			Iterator<String> it = alRecords.iterator();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Runtime r = Runtime.getRuntime();
			r.gc();
		}
		System.out.println("Number of Unique Records are " + alUnique.size());
		return alUnique;
	}

	/**
	 * This method will provide the file path and url
	 *
	 * @param strPath
	 */
	@SuppressWarnings("deprecation")
	private static void javaIOIURLgetFilePathandURL(String strPath) {
		File objFile = new File(strPath);
		URL url = null;

		try {
			url = objFile.toURL();
			System.out.println(url);
			objFile = new File(url.getFile());
			System.out.println(objFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	/**
	 * This method is used to get the absoulte relative path for a file.
	 *
	 * @param strFile
	 */
	private static void javaIOGetAbsoulteRelativePath(String strFile) {
		File file = new File("txt1.txt");
		file = file.getAbsoluteFile();
		System.out.println(file.toString());
	}

	/*
	 * Check the validation that can be done on character. Check if character is
	 * lower case, upper case
	 */
	private static void javaCheckChar() {
		String str = "123A456B789C";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				System.out.println("Digit " + str.charAt(i));
			else if (Character.isLetter(str.charAt(i)))
				System.out.println("Number " + str.charAt(i));
		}

		char a = 'a';
		System.out.println(Character.isLowerCase(a));
		System.out.println(Character.isUpperCase(a));
		System.out.println(Character.isLowerCase(1));
	}

	/**
	 * This method is used to check if two different file object/file are same or
	 * different.
	 */
	private static void javaCheckFileReferSameFile() {
		File file1 = new File("D://Harsh//workspace//Test//src//txt1.txt");
		File file2 = new File("D://Harsh//workspace//Test//src//txt1.txt");
		File file3 = new File("..//txt1.txt");
		File file4 = new File("txt1.txt");
		System.out.println(file1.equals(file2));

		try {
			System.out.println(file1.getCanonicalPath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(file3.getAbsolutePath());
			System.out.println(file4.getCanonicalPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to get the parent file and path.
	 *
	 * @param strPath
	 */
	private static void javaIOGetParentFileandPath(String strPath) {
		File file = new File(strPath);
		String parentPath = file.getParent();
		System.out.println(parentPath);
		File parentDir = file.getParentFile();
	}

	/**
	 * This method is used to check if file/directory is present or not.
	 */
	private static void javaIOCheckFileorDirAndPresent() {
		File dir = new File(strFileNm);
		boolean isdir = dir.isDirectory();
		System.out.println(isdir);

		boolean isfile = dir.isFile();
		System.out.println(isfile);

		boolean isfileExist = dir.exists();
		System.out.println(isfileExist);
	}

	/**
	 * Creates the file and then delete the created file.
	 */
	private static void javaIOCreateFileandDelete() {
		File file = new File("D://harsh//txt1.txt");

		try {
			boolean bflag = file.createNewFile();
			System.out.println(bflag);
			bflag = file.delete();
			System.out.println(bflag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Move the file from one location to another by Java API
	 */
	private static void javaIOFileMove() {
		File oldFile = new File("D://Harsh//txt1.txt");
		File oldFile1 = new File("D://Harsh//read.xls");
		File newFile = new File("d://harsh//moved");
		File newFile1 = new File("d://harsh//moved//read.xls");
		boolean bflag = oldFile.renameTo(new File(newFile, oldFile.getName()));
		System.out.println(bflag);
		bflag = oldFile1.renameTo(newFile1);
		System.out.println(bflag);
	}

	/**
	 * Copies the directory from one location to another and there childrens also.
	 *
	 * @param srcDir
	 * @param dstDir
	 */
	private static void javaIOCopyDirectory(File srcDir, File dstDir) {
		if (srcDir.isDirectory()) {
			if (!dstDir.exists()) {
				dstDir.mkdir();
			}
			String[] children = srcDir.list();
			for (int i = 0; i < children.length; i++) {
				javaIOCopyDirectory(new File(srcDir, children[i]), new File(dstDir, children[i]));
			}
		} else {
			// This method is implemented in Copying a File
			// copyFile(srcDir, dstDir);
		}
	}

	/**
	 * To delete an directory from file system
	 */
	private static void javaIODeleteDirectory() {
		boolean success = (new File("D:/Harsh/Upload1")).delete();
		System.out.println("Status is " + success);
	}

	/**
	 * Lists the files in the root directory
	 */
	private static void javaIOListSystemFileRoot() {
		File[] roots = File.listRoots();

		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
		}
	}

	/**
	 * Lists the files in any given directory.
	 */
	private static void javaIOListSystemFileDiectory() {
		File dir = new File("C:/Harsh");
		if (dir.isDirectory()) {
			String[] children = dir.list();

			for (int i = 0; i < children.length; i++) {
				// System.out.println(dir.toString()+File.separator+children[i]);
				String strFile = dir.toString() + File.separator + children[i];
				File checkFile = new File(strFile);
				if (!checkFile.isDirectory()) {
					System.out.println(strFile);
				}
				javaVisitAllFiles(new File(dir, children[i]));
			}
		}
	}

	/**
	 * Displays the files in any directory
	 *
	 * @param dir
	 */
	private static void javaVisitAllFiles(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();

			for (int i = 0; i < children.length; i++) {
				System.out.println(dir.toString() + File.separator + children[i]);
				javaVisitAllFiles(new File(dir, children[i]));
			}
		}
	}

	/**
	 * Copy a file from one location to another in the file system
	 */
	private static void javaIOCopyFile() {
		String src = "D:/Harsh/Upload/UploadHandler.java";
		String dst = "D:/Harsh/Upload/UploadHandler1.java";
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dst);

			// Transfer bytes from in to out
			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Forcefully write a files on the file system
	 */
	private static void javaIOForcfullyWritingOnDisc() {
		FileOutputStream os = null;
		try {
			os = new FileOutputStream("D:/Harsh/Upload/UploadHandler1.java");
			FileDescriptor fd = os.getFD();
			byte[] data = new byte[] { (byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE, 'h', 'a' };
			os.write(data);
			os.flush();
			fd.sync();
		} catch (IOException e) {
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Shows the description of the files. Like modified time and new modified. Also
	 * alter the last modified time
	 */
	private static void javaIOGettingFileDesc() {
		File file = new File("D:/Harsh/Upload/UploadHandler.java");
		long modifiedTime = file.lastModified();
		long newModifiedTime = System.currentTimeMillis();
		System.out.println("Old Modified Time " + new Date(modifiedTime));
		System.out.println("New Modified Time " + new Date(newModifiedTime));

		boolean success = file.setLastModified(newModifiedTime);
		if (success) {
			System.out.println("Succesfully changed");
		}

		long length = file.length();
		System.out.println("Size of file is " + length);
	}

	/**
	 * Moves the files from one location to another
	 */
	private static void javaIOMovefile() {
		File file = new File("D:/Harsh/Upload/UploadHandler.java");
		File dir = new File("D:/Harsh/");
		boolean success = file.renameTo(new File(dir, file.getName()));

		if (success) {
			System.out.println("File was successfully moved");
		}
	}

	/**
	 * Append the data into the files.
	 *
	 * @throws IOException
	 */
	private static void javaIORenameFileandAppend() throws IOException {
		File file = new File("D:/Harsh/Upload/UploadHandler.java");
		File file2 = new File("D:/Harsh/Upload/UploadHandler22.java");
		boolean success = file.renameTo(file2);

		if (!success) {
			// File was not successfully renamed
		}
		BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
		out.write("aString");
		out.close();
	}

	/**
	 * This reads the file in the file system
	 *
	 * @throws IOException
	 */
	private static void javaIOReadFile() throws IOException {
		File file = new File("D:/Harsh/Upload/UploadHandler.java");
		in = new BufferedReader(new FileReader(file));
		String str;

		while ((str = in.readLine()) != null) {
			System.out.println(str.toString());
		}
	}

	/**
	 * this write the data to the file
	 *
	 * @throws IOException
	 */
	private static void javaIOWriteFile() throws IOException {
		File file = new File("D:/Harsh/Upload/UploadHandler.java");
		BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
		out.write("aString");
		out.close();
	}

	/**
	 * Using reflection we can get the method and object type of he class and the
	 * class location. Also provide the interfaces that class is implementing
	 *
	 * @throws ClassNotFoundException
	 */
	private void javaRefelectionObjectTypeAndClassLoc() throws ClassNotFoundException {
		Class cls = java.lang.String.class;
		boolean isClass = cls.isInterface();
		System.out.println(isClass);
		cls = java.lang.Cloneable.class;
		isClass = cls.isInterface();
		System.out.println(isClass);
		cls = this.getClass();

		ProtectionDomain pDomain = cls.getProtectionDomain();
		CodeSource cSource = pDomain.getCodeSource();
		URL loc = cSource.getLocation();
		System.out.println(loc);
		cls = Class.forName("java.lang.String");
		System.out.println(cls);
		System.out.println(cls.getSuperclass());
		System.out.println(cls.getClass());

		Class objClass = java.lang.String.class;
		Class[] intf = objClass.getInterfaces();
		System.out.println(intf);
	}

	/**
	 * Call an process and then get the output of that process in java to save or to
	 * display.
	 *
	 * @throws IOException
	 */
	private static void javaReadOutputCommand() throws IOException {
		String command = "mspaint";
		Process child = Runtime.getRuntime().exec(command);
		InputStream in = child.getInputStream();
		int c;

		while ((c = in.read()) != -1) {
			System.out.println(c);
		}
		in.close();
	}

	/**
	 * Displays the date in different formats.
	 */
	private static void javaDifferentDateFormat() {
		Date now = new Date();

		// See what toString() returns
		System.out.println(" 1. " + now.toString());

		// Next, try the default DateFormat
		System.out.println(" 2. " + DateFormat.getInstance().format(now));

		// And the default time and date-time DateFormats
		System.out.println(" 3. " + DateFormat.getTimeInstance().format(now));
		System.out.println(" 4. " + DateFormat.getDateTimeInstance().format(now));

		// Next, try the short, medium and long variants of the
		// default time format
		System.out.println(" 5. " + DateFormat.getTimeInstance(DateFormat.SHORT).format(now));
		System.out.println(" 6. " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now));
		System.out.println(" 7. " + DateFormat.getTimeInstance(DateFormat.LONG).format(now));

		// For the default date-time format, the length of both the
		// date and time elements can be specified. Here are some examples:
		System.out.println(" 8. " + DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(now));
		System.out.println(" 9. " + DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(now));
		System.out.println("10. " + DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(now));

		Date date = new Date();

		String s = DateFormat.getDateInstance(DateFormat.SHORT).format(date);
		System.out.println(s);
		// 2/16/02
		s = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
		System.out.println(s);
		// Feb 16, 2002
		s = DateFormat.getDateInstance(DateFormat.LONG).format(date);
		System.out.println(s);
		// February 16, 2002
		s = DateFormat.getDateInstance(DateFormat.FULL).format(date);
		System.out.println(s);
		// Saturday, February 16, 2002
		// This is same as MEDIUM
		s = DateFormat.getDateInstance().format(date);
		System.out.println(s);
		// Feb 16, 2002
		// This is same as MEDIUM
		s = DateFormat.getDateInstance(DateFormat.DEFAULT).format(date);
		System.out.println(s);

		// Feb 16, 2002

		// Parse
		try {
			date = DateFormat.getDateInstance(DateFormat.DEFAULT).parse("Feb 16, 2002");
			System.out.println(date.toString());
		} catch (ParseException e) {
		}

		// output
		// 1. Fri Jan 08 16:39:28 IST 2010
		// 2. 1/8/10 4:39 PM
		// 3. 4:39:28 PM
		// 4. Jan 8, 2010 4:39:28 PM
		// 5. 4:39 PM
		// 6. 4:39:28 PM
		// 7. 4:39:28 PM IST
		// 8. 1/8/10 4:39 PM
		// 9. Jan 8, 2010 4:39 PM
		// 10. January 8, 2010 4:39:28 PM IST
	}

	/**
	 * creation of manifest of a jar and provide some data in that manifest.
	 */
	public static void javaCreateManifest4Jar() {
		try {
			InputStream fis = new FileInputStream("D:/Harsh/MANIFEST.MF");
			OutputStream outfis = new FileOutputStream("D:/Harsh/Test.MF");
			Manifest manifest = new Manifest(fis);

			// Construct a string version of a manifest
			StringBuffer sbuf = new StringBuffer();
			sbuf.append("Manifest-Version: 1.0\n");
			sbuf.append("\n");
			sbuf.append("Name: javax/swing/JScrollPane.class\n");
			sbuf.append("Java-Bean: True\n");

			// Convert the string to a input stream
			InputStream is = new ByteArrayInputStream(sbuf.toString().getBytes("UTF-8"));

			// Create the manifest
			manifest = new Manifest(is);
			manifest.write(outfis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * List the manifest in any jar and its key values.
	 */
	public static void javaListManifest4mJar() {
		JarFile jarfile = null;
		try {
			// Open the JAR file
			jarfile = new JarFile("C:\\Harsh\\workspace\\jar\\ojdbc14.jar");

			// Get the manifest
			Manifest manifest = jarfile.getManifest();

			// Get the manifest entries
			Map map = manifest.getEntries();
			System.out.println(map.keySet());
			System.out.println(manifest.getEntries().keySet());

			// Enumerate each entry
			for (Iterator it = map.keySet().iterator(); it.hasNext();) {
				// Get entry name
				String entryName = (String) it.next();

				// Get all attributes for the entry
				Attributes attrs = (Attributes) map.get(entryName);

				// Enumerate each attribute
				for (Iterator it2 = attrs.keySet().iterator(); it2.hasNext();) {
					// Get attribute name
					Attributes.Name attrName = (Attributes.Name) it2.next();

					// Get attribute value
					String attrValue = attrs.getValue(attrName);
					System.out.println(attrValue);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				jarfile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Logging in the XML instead of log files.
	 */
	private static void javaLoggingInXml() {
		java.util.logging.Logger logger = java.util.logging.Logger.getLogger("AllJavaCode");

		// Create a new handler that uses the simple formatter
		try {
			FileHandler fh = new FileHandler("D:\\Harsh\\mylog.txt");
			fh.setFormatter(new SimpleFormatter());
			logger.addHandler(fh);
		} catch (IOException e) {
		}

		// Create a new handler that uses the XML formatter
		try {
			FileHandler fh = new FileHandler("D:\\Harsh\\mylog.xml");
			fh.setFormatter(new XMLFormatter());
			logger.addHandler(fh);
		} catch (IOException e) {
		}

		// Log a few messages
		logger.severe("my severe message");
		logger.warning("my warning message");
		logger.info("my info message");
		logger.config("my config message");
		logger.fine("my fine message");
		logger.finer("my finer message");
		logger.finest("my finest message");
	}

	/**
	 * Logging the logs in the log file.
	 */
	private static void javaWritingLogFile() {
		try {
			// Create a file handler that write log record to a file called
			// my.log
			FileHandler handler = new FileHandler("D:\\Harsh\\my.log", true);

			// Add to the desired logger
			java.util.logging.Logger loggerr = java.util.logging.Logger.getLogger("Harsh");
			loggerr.addHandler(handler);
			loggerr.entering("harts", "hahah");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Compress a file to gzip.
	 */
	private static void javaZipCompressFile2Gzip() {
		try {
			// Create the GZIP output stream
			String outFilename = "D:\\Harsh\\Info.gzip";
			GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(outFilename));

			// Open the input file
			String inFilename = "D:\\Harsh\\Info.xls";
			FileInputStream in = new FileInputStream(inFilename);

			// Transfer bytes from the input file to the GZIP output stream
			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			// Complete the GZIP file
			out.finish();
			out.close();
		} catch (IOException e) {
		}
	}

	/**
	 * Uncompress a gzip file.
	 */
	private static void javaZipUncompressGzip2File() {
		try {
			// Open the compressed file
			String inFilename = "D:\\Harsh\\outfile.gzip";
			GZIPInputStream in = new GZIPInputStream(new FileInputStream(inFilename));

			// Open the output file
			String outFilename = "D:\\Harsh\\Info1.xls";
			OutputStream out = new FileOutputStream(outFilename);

			// Transfer bytes from the compressed file to the output file
			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

			// Close the file and stream
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Zip/compress a file.
	 */
	private static void javaCreateZipFile() {
		String[] filenames = new String[] { "D:\\Harsh\\Info.xls" };
		// Create a buffer for reading the files
		byte[] buf = new byte[1024];
		try {
			// Create the ZIP file
			String outFilename = "D:\\Harsh\\Info.zip";
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));
			// Compress the files
			for (int i = 0; i < filenames.length; i++) {
				FileInputStream in = new FileInputStream(filenames[i]);
				// Add ZIP entry to output stream.
				out.putNextEntry(new ZipEntry(filenames[i]));
				// Transfer bytes from the file to the ZIP file
				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}
				// Complete the entry
				out.closeEntry();
				in.close();
			}
			// Complete the ZIP file
			out.close();
		} catch (IOException e) {
		}
	}

	/**
	 * Display the content of an Zip file.
	 */
	private static void javaListZipContent() {
		ZipFile zf = null;
		try {
			// Open the ZIP file
			zf = new ZipFile("C:\\Harsh\\workspace\\jar\\ojdbc14.jar");

			// Enumerate each entry
			for (Enumeration entries = zf.entries(); entries.hasMoreElements();) {
				// Get the entry name
				String zipEntryName = ((ZipEntry) entries.nextElement()).getName();
				System.out.println(zipEntryName.toString());
			}
		} catch (IOException e) {
		} finally {
			try {
				zf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Generate a simple png or jpg file.
	 */
	private static void javaGenerateJpegPngFile() {
		RenderedImage rendImage = javaGraphicsMyCreateImage();

		// Write generated image to a file
		try {
			// Save as PNG
			File file = new File("D:\\Harsh\\newimage.png");
			ImageIO.write(rendImage, "png", file);

			// Save as JPEG
			file = new File("D:\\Harsh\\newimage.jpg");
			ImageIO.write(rendImage, "jpg", file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Returns a generated image.
	/**
	 * CReates a simple image.
	 *
	 * @return
	 */
	public static RenderedImage javaGraphicsMyCreateImage() {
		int width = 100;
		int height = 100;

		// Create a buffered image in which to draw
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		// Create a graphics contents on the buffered image
		Graphics2D g2d = bufferedImage.createGraphics();
		// Draw graphics
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, width, height);
		g2d.setColor(Color.black);
		g2d.fillOval(0, 0, width, height);

		// Graphics context no longer needed so dispose it
		g2d.dispose();

		return bufferedImage;
	}

	/**
	 * Number formatting. display interger, int in different formats.
	 */
	private static void javaFormattingNumber() {
		NumberFormat formatter = new DecimalFormat("000000");
		String s = formatter.format(-1234.567); // -001235
		System.out.println(s);
		// notice that the number was rounded up

		// The # symbol shows a digit or nothing if no digit present
		formatter = new DecimalFormat("##");
		s = formatter.format(-1234.567); // -1235
		System.out.println(s);
		s = formatter.format(0); // 0
		System.out.println(s);
		formatter = new DecimalFormat("##00");
		s = formatter.format(0); // 00
		System.out.println(s);

		// The . symbol indicates the decimal point
		formatter = new DecimalFormat(".00");
		s = formatter.format(-.567); // -.57
		System.out.println(s);
		formatter = new DecimalFormat("0.00");
		s = formatter.format(-.567); // -0.57
		System.out.println(s);
		formatter = new DecimalFormat("#.#");
		s = formatter.format(-1234.567); // -1234.6
		System.out.println(s);
		formatter = new DecimalFormat("#.######");
		s = formatter.format(-1234.567); // -1234.567
		System.out.println(s);
		formatter = new DecimalFormat(".######");
		s = formatter.format(-1234.567); // -1234.567
		System.out.println(s);
		formatter = new DecimalFormat("#.000000");
		s = formatter.format(-1234.567); // -1234.567000
		System.out.println(s);

		// The , symbol is used to group numbers
		formatter = new DecimalFormat("#,###,###");
		s = formatter.format(-1234.567); // -1,235
		System.out.println(s);
		s = formatter.format(-1234567.890); // -1,234,568
		System.out.println(s);

		// The ; symbol is used to specify an alternate pattern for negative
		// values
		formatter = new DecimalFormat("#;(#)");
		s = formatter.format(-1234.567); // (1235)
		System.out.println(s);

		// The ' symbol is used to quote literal symbols
		formatter = new DecimalFormat("'#'#");
		s = formatter.format(-1234.567); // -#1235 formatter = new
		// DecimalFormat("'abc'#"); s =
		// formatter.format(-1234.567); //
		// -abc1235

		// formatting numbers upto 2 decimal places in Java
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		System.out.println(df.format(364565.14));
		System.out.println(df.format(364565.1454));

		// formatting numbers upto 3 decimal places in Java
		df = new DecimalFormat("#,###,##0.000");
		System.out.println(df.format(364565.14));
		System.out.println(df.format(364565.1454));
		String strFormatted = df.format(12345.6789);
		System.out.println(strFormatted);
		System.out.println(s);
	}

	/**
	 * Listing all the variables of Locale class.
	 */
	private static void javaListingAllLocaleVariable() {
		Locale[] locales = Locale.getAvailableLocales();

		for (int i = 0; i < locales.length; i++) {
			// Get the 2-letter language code
			String language = locales[i].getLanguage();

			// Get the 2-letter country code; may be equal to ""
			String country = locales[i].getCountry();

			// Get localized name suitable for display to the user
			String locName = locales[i].getDisplayName();
			System.out.println(language + " " + country + " " + locName);
		}
	}

	/**
	 * Generates random numbers
	 */
	@SuppressWarnings("unused")
	private static void javaGenerateRandomNumber() {
		Random rand = new Random();

		// Random integers
		int i = rand.nextInt();

		// Continually call nextInt() for more random integers ...
		// Random integers that range from from 0 to n
		int n = 10;
		i = rand.nextInt(n + 1);

		// Random bytes
		byte[] bytes = new byte[5];
		rand.nextBytes(bytes);

		// Other primitive types
		boolean b = rand.nextBoolean();
		long l = rand.nextLong();
		float f = rand.nextFloat(); // 0.0 <= f < 1.0
		double d = rand.nextDouble(); // 0.0 <= d < 1.0

		// Create two random number generators with the same seed
		long seed = rand.nextLong();
		System.out.println(seed);
		rand = new Random(seed);

		Random rand2 = new Random(seed);
	}

	/**
	 * compares the dates.
	 */
	private static void javaCompareDates() {
		Calendar xmas = new GregorianCalendar(2010, Calendar.JANUARY, 1);

		Calendar newyears = new GregorianCalendar(2010, Calendar.JANUARY, 11);

		// System.out.println(new Date().getYear()+new Date().getMonth()+new
		// Date().getDate());
		// Calendar newyears = new GregorianCalendar(new Date().getYear(),new
		// Date().getMonth(),new Date().getDate());
		// new Date().getYear()
		// Determine which is earlier
		boolean b = xmas.after(newyears); // false
		System.out.println(b);
		b = xmas.before(newyears); // true
		System.out.println(b);

		// Get difference in milliseconds
		long diffMillis = newyears.getTimeInMillis() - xmas.getTimeInMillis();
		System.out.println(diffMillis);

		// Get difference in seconds
		long diffSecs = diffMillis / (1000); // 604800
		System.out.println(diffSecs);

		// Get difference in minutes
		long diffMins = diffMillis / (60 * 1000); // 10080
		System.out.println(diffMins);

		// Get difference in hours
		long diffHours = diffMillis / (60 * 60 * 1000); // 168
		System.out.println(diffHours);

		// Get difference in days
		long diffDays = diffMillis / (24 * 60 * 60 * 1000); // 7
		System.out.println(diffDays);
	}

	/**
	 * convert the collection to read only
	 */
	private static void javaCollectionReadOnly() {
		List<String> stuff = Arrays.asList(new String[] { "a", "b" });

		// Make a list read-only
		List list = new ArrayList(stuff);
		list = Collections.unmodifiableList(list);

		try {
			// Try modifying the list
			list.set(0, "new value");
		} catch (UnsupportedOperationException e) {
			// Can't modify
		}

		// Make a set read-only
		Set<String> set = new HashSet<String>(stuff);
		set = Collections.unmodifiableSet(set);

		// Make a map read-only
		Map map = new HashMap();
		// Add key/value pairs ...
		map = Collections.unmodifiableMap(map);
	}

	/**
	 * Shallow copy of collection
	 */
	private static void javaShallowCopyCollection() {
		List<String> stuff = Arrays.asList(new String[] { "a", "b" });

		// Make a copy of a list
		List<String> list = new ArrayList<String>(stuff);
		List<String> list2 = new LinkedList<String>(list);

		// Make a copy of a set
		Set<String> set = new HashSet<String>(stuff);
		Set<String> set2 = new TreeSet<String>(set);

		// Make a copy of a map
		Map map = new HashMap();

		// Add key/value pairs ...
		Map map2 = new TreeMap(map);
	}

	/**
	 * Finding out number of days in any given month
	 */
	private static void javaNumberOfDaysInMonth() {
		Calendar cal = new GregorianCalendar(2010, Calendar.JANUARY, 1);

		// Get the number of days in that month
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
		System.out.println(days);
		// Try month in a leap year
		cal = new GregorianCalendar(2000, Calendar.FEBRUARY, 1);
		days = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 29
		System.out.println(days);
	}

	/**
	 * Generate current date by Calendar class and get every information like
	 * hour,minute, second, day, year, era etc
	 */
	private static void javaDateCurrentDate() {
		Calendar cal = new GregorianCalendar();
		int era = cal.get(Calendar.ERA); // 0=BC, 1=AD
		int year = cal.get(Calendar.YEAR); // 2002
		int month = cal.get(Calendar.MONTH); // 0=Jan, 1=Feb, ...
		int day = cal.get(Calendar.DAY_OF_MONTH); // 1...
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1=Sunday, 2=Monday,
		// ...
		int hour12 = cal.get(Calendar.HOUR); // 0..11
		int hour24 = cal.get(Calendar.HOUR_OF_DAY); // 0..23
		int min = cal.get(Calendar.MINUTE); // 0..59
		int sec = cal.get(Calendar.SECOND); // 0..59
		int ms = cal.get(Calendar.MILLISECOND); // 0..999
		int ampm = cal.get(Calendar.AM_PM); // 0=AM, 1=PM
		System.out.println(era);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(dayOfWeek);
		System.out.println(hour12);
		System.out.println(hour24);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(ms);
		System.out.println(ampm);
	}

	/**
	 * find out the day of that date
	 */
	private static void javaGetSomeDateAndDetails() {
		Calendar xmas = new GregorianCalendar(2010, Calendar.JANUARY, 11);
		int dayOfWeek = xmas.get(Calendar.DAY_OF_WEEK); // 6=Friday
		System.out.println(dayOfWeek);

		Calendar cal = new GregorianCalendar(2003, Calendar.JANUARY, 1);
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 4=Wednesday
		System.out.println(dayOfWeek);
	}

	/**
	 * Sorting of a list
	 */
	private static void javaCollectionSortList() {
		String[] strArray = new String[] { "z", "a", "C" };
		List<String> list = Arrays.asList(strArray);

		// Sort
		Collections.sort(list);
		// C, a, z

		// Case-insensitive sort
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		// a, C, z

		// Reverse-order sort
		Collections.sort(list, Collections.reverseOrder());
		// z, a, C

		// Case-insensitive reverse-order sort
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		Collections.reverse(list);
		// z, C, a
	}

	/**
	 * Check if the year is a leap year or not.
	 */
	private static void javaCheckLeapYr() {
		GregorianCalendar cal = new GregorianCalendar();
		boolean b = cal.isLeapYear(1998); // false
		System.out.println(b);
		b = cal.isLeapYear(2000); // true
		System.out.println(b);
		b = cal.isLeapYear(0); // true
		System.out.println(b);
	}

	/**
	 * find a element in the sorted set.
	 */
	private static void javaCollectionFindElementInSortedSet() {
		List<String> sortedList = new LinkedList<String>();
		sortedList.addAll(Arrays.asList(new String[] { "ant", "bat", "cat", "dog", "mat" }));

		// Search for the word "cat"
		int index = Collections.binarySearch(sortedList, "cat"); // 2
		System.out.println(index);
		// Search for a non-existent element
		index = Collections.binarySearch(sortedList, "cow"); // -4
		System.out.println(index);
	}

	/**
	 * Formatting the number for currency.
	 */
	private static void javaFormatNumber2Currency() {
		double payment = Math.random() * 1000;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println("Your payment is " + nf.format(payment));
	}

	/**
	 * Format the message with MessageFormat at runtime.
	 */
	private static void javaFormatMessage() {
		Object[] params = new Object[] { "Tom", "Dick" };
		String message = MessageFormat.format("{0} and {1} are good friends", params);
		System.out.println(message);
	}

	/**
	 * Compare two strings
	 */
	private static void javaCompare2String() {
		Collator collator = Collator.getInstance(Locale.GERMAN);
		if (collator.compare("gutten", "gutten") == 0) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Both Strings are not equal");
		}
	}

	/**
	 * total number of lines in a file
	 */
	private static void javaIOLinesInFile() {
		LineNumberReader lineCounter = null;
		try {
			lineCounter = new LineNumberReader(new InputStreamReader(new FileInputStream(
					"C:" + File.separator + "Harsh" + File.separator + "Personal" + File.separator + "txt1.txt")));
			String nextLine = null;
			while ((nextLine = lineCounter.readLine()) != null) {
				if (nextLine == null)
					break;
			}
			System.out.println("Total number of line in this file " + lineCounter.getLineNumber());
		} catch (Exception done) {
			done.printStackTrace();
		} finally {
			try {
				lineCounter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * redirect the output to system stream i.e console
	 */
	private static void javaRedirectOutputToSystemStream() {
		File file = new File("C:\\Harsh\\Personal\\txt1.txt");
		try {
			// Creates and PrintStream Object for the File.
			PrintStream printStream = new PrintStream(file);
			System.out.println("1111111");
			// Redirect the output to the printStream.
			System.setOut(printStream);
			System.out.println("This is redirected output");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * get the output of external command/process in java
	 */
	private static void javaExternalCmdOutputCapture() {
		try {
			String line;
			Process p = Runtime.getRuntime().exec("mspaint");
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}

	/**
	 * reading the input from console.
	 */
	private static void javaConsoleRead() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.print("Enter the Word :- ");
			String s = br.readLine();
			System.out.println("You have Enterd :- " + s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * reading the environment variables.
	 */
	private static void javaReadEnvVariables() {
		Map<String, String> envVariables = System.getenv();
		Set stEnvVariables = envVariables.entrySet();
		Iterator itrEnvVariables = stEnvVariables.iterator();

		while (itrEnvVariables.hasNext()) {
			Map.Entry mpEnvVar = (Map.Entry) itrEnvVariables.next();
			System.out.println(mpEnvVar.getKey() + "=" + mpEnvVar.getValue());

		}
	}

	/**
	 * Compress the folder.
	 */
	private static void javaZipCompressFolder() {
		File strSrc = new File("C:\\Harsh\\temp\\Backup\\20100368_1103691");
		File strDes = new File(strSrc + ".zip");
		try {
			ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(strDes)));
			BufferedInputStream in = null;
			byte[] data = new byte[1000];
			String files[] = strSrc.list();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i] + " " + new File(files[i]).isDirectory());
				if (!new File(files[i]).isDirectory()) {
					javaCompressFolderAnother(files[i], in, out);
				} else {
					in = new BufferedInputStream(new FileInputStream(strSrc.getPath() + "/" + files[i]), 1000);
					out.putNextEntry(new ZipEntry(files[i]));
					int count;
					while ((count = in.read(data, 0, 1000)) != -1) {
						out.write(data, 0, count);
					}
					out.closeEntry();
				}
			}
			out.flush();
			out.close();
		} catch (Exception c) {
			c.printStackTrace();
		}

	}

	private static void javaCompressFolderAnother(String strFileNm, BufferedInputStream in, ZipOutputStream out) {
		File strSrc = new File(strFileNm);
		try {
			byte[] data = new byte[1000];
			String files[] = strSrc.list();
			for (int i = 0; i < files.length; i++) {
				in = new BufferedInputStream(new FileInputStream(strSrc.getPath() + "/" + files[i]), 1000);
				out.putNextEntry(new ZipEntry(files[i]));
				int count;
				while ((count = in.read(data, 0, 1000)) != -1) {
					out.write(data, 0, count);
				}
				out.closeEntry();
			}
			out.flush();
			out.close();
		} catch (Exception c) {
			c.printStackTrace();
		}
	}

	/**
	 * Get Key and Values from Map.
	 */
	private static void javaGetMapKeysAndValues() {
		Map<String, String> hMapFileLoc = new HashMap<String, String>();
		hMapFileLoc.put("1", "arg1");
		hMapFileLoc.put("2", "arg2");
		hMapFileLoc.put("3", "arg3");
		for (Object o : hMapFileLoc.entrySet()) {
			Map.Entry entry = (Map.Entry) o;
			System.out.println(entry.getKey().toString() + "  " + entry.getValue().toString());
		}
	}

	/**
	 * Take the snapshot of the screen and save it in png file.
	 *
	 * @throws Exception
	 */
	private static void javaTakeSnapshot() throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMDD_HHMMSS");
		Date date = new Date();
		String fileLocation = "C:\\temp\\" + simpleDateFormat.format(date) + ".png";
		System.out.println("Snapshot File Name is " + fileLocation);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screenSize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		File file = new File(fileLocation);
		if (!file.exists()) {
			file.createNewFile();
		}
		ImageIO.write(image, "png", file);
		date = new Date();
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Rectangle screenSz = new Rectangle(0, 0, toolkit.getScreenSize().width, toolkit.getScreenSize().height);
		Robot robot1 = new Robot();
		BufferedImage bfIimage = robot1.createScreenCapture(screenSz);
		ImageIO.write(bfIimage, "png", file);
	}

	/**
	 * Calling an application from java
	 */
	private static void javaSystemCall() {
		String shortcutPath = "";
		Process execAcrobatPrs = null;
		try {
			execAcrobatPrs = Runtime.getRuntime().exec(new String[] { "cmd", "/c", "start AcroRd32.exe" });
			// execAcrobatPrs.waitFor();
		} catch (Exception ex) {
			if (execAcrobatPrs != null) {
				execAcrobatPrs.destroy();
			}
			ex.printStackTrace();
			System.exit(-1);
		}
	}

	/**
	 * Calling an application from java
	 */
	private static void javaPDFCombine() {
		List<InputStream> list = new ArrayList<InputStream>();
		try {
			// Source pdfs
			list.add(new FileInputStream(new File("C:/Harsh/temp/1.pdf")));
			list.add(new FileInputStream(new File("C:/Harsh/temp/2.pdf")));

			// Resulting pdf
			OutputStream out = new FileOutputStream(new File("C:\\Harsh\\temp/result.pdf"));

			javaPDFMerge(list, out);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void javaPDFMerge(List<InputStream> list, OutputStream outputStream)
			throws DocumentException, IOException {
		com.itextpdf.text.Document document = new com.itextpdf.text.Document();
		PdfWriter writer = PdfWriter.getInstance(document, outputStream);
		document.open();
		PdfContentByte cb = writer.getDirectContent();

		for (InputStream in : list) {
			PdfReader reader = new PdfReader(in);
			for (int i = 1; i <= reader.getNumberOfPages(); i++) {
				document.newPage();
				// import the page from source pdf
				PdfImportedPage page = writer.getImportedPage(reader, i);
				// add the page to the destination pdf
				cb.addTemplate(page, 0, 0);
			}
		}

		outputStream.flush();
		document.close();
		outputStream.close();
	}

	/**
	 * this method initialize the list by creating the inner class
	 */
	private static void javaInitializeListByInnerClass() {
		List<String> obj = new ArrayList<String>() {
			/**
			 * serialVersionUID
			 */
			private static final long serialVersionUID = 3721863424875777832L;

			{
				add("harsh");
				add("test");
			}
		};
		for (int i = 0; i < obj.size(); i++)
			System.out.println(obj.get(i));
	}

	/**
	 * This method download a image from network and save into the some folder
	 */
	private static void javaGetImageFromNetwork() {
		Image image = null;
		try {
			// Read from a file
			File sourceimage = new File("source.gif");
			image = ImageIO.read(sourceimage);

			// Read from an input stream
			InputStream is = new BufferedInputStream(new FileInputStream("source.gif"));
			image = ImageIO.read(is);

			// Read from a URL
			URL url = new URL("http://im.rediff.com/money/2010/mar/09rupee123.jpg");
			image = ImageIO.read(url);

			// Use a label to display the image
			JFrame frame = new JFrame();
			JLabel label = new JLabel(new ImageIcon(image));
			frame.getContentPane().add(label, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);

		} catch (IOException e) {
		}
	}

	/**
	 * This method add some content to xml file
	 */
	private static void javaXMLAddContent2File() {
		String Header = "Start";
		String EndTag = "End";
		try {
			InputStream headerStream = new ByteArrayInputStream(Header.getBytes("UTF-8"));
			InputStream EndTagStream = new ByteArrayInputStream(EndTag.getBytes("UTF-8"));
			byte[] bytesFile = Header.getBytes("UTF-8");
			InputStream is = new FileInputStream("C://Harsh//T.xml");
			// byte[] bytes = new byte[headerStream.available() + is.available()
			// + EndTagStream.available()];

			Vector<InputStream> inputstreams = new Vector<InputStream>();
			inputstreams.add(headerStream);
			inputstreams.add(is);
			inputstreams.add(EndTagStream);

			File f = new File("C://Harsh//out.xml");

			Enumeration<InputStream> enu = inputstreams.elements();
			InputStream fileStream = new SequenceInputStream(enu);

			OutputStream out = new FileOutputStream(f);
			byte buf[] = new byte[1024];
			int len;
			while ((len = fileStream.read(buf)) > 0)
				out.write(buf, 0, len);
			out.close();
			fileStream.close();
			System.out.println("\nFile is created........");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method encrypt and decrypt a string
	 */
	private static void javaEncryptDecrypt() {
		String s[] = new String[] { "9", "harsh" };
		int action = 0;
		try {
			action = Integer.parseInt(s[0]);
			System.out.println(" Action to be taken :" + action);

			switch (action) {
			case 1:
				String encr = AllJavaCode.javaEncrypt(s[1]);
				System.out.println(" Encrypted String " + s[0] + " is : " + encr);
				break;

			case 2:
				String decr = AllJavaCode.javaDecrypt(s[1]);
				System.out.println(" Decrypted String of " + s[1] + " is : " + decr);
				break;

			case 9:
				String enc = AllJavaCode.javaEncrypt(s[1]);
				System.out.println(" Encrypted String : " + enc);
				String dec = AllJavaCode.javaDecrypt(enc);
				System.out.println(" Decrypted String : " + dec);
				break;

			default:
				System.out.println(" Wrong parameter value passed, please check ... ");
				break;
			}
		} catch (Exception e) {
			System.out.println(" Invalid input provided for first param");
			System.exit(0);
		}
	}

	/**
	 * @param unencryptedString
	 * @return
	 * @throws EncryptionException
	 */
	public static String javaEncrypt(String unencryptedString) throws EncryptionException {
		if (unencryptedString == null || unencryptedString.trim().length() == 0)
			throw new IllegalArgumentException("Unencrypted string cant be null or empty");

		try {
			byte[] keyAsBytes = unencryptedString.getBytes(UNICODE_FORMAT);
			BASE64Encoder base64encoder = new BASE64Encoder();
			return base64encoder.encode(keyAsBytes);
		} catch (Exception e) {
			throw new EncryptionException(e);
		}
	}

	/**
	 * @param encryptedString
	 * @return
	 * @throws EncryptionException
	 */
	public static String javaDecrypt(String encryptedString) throws EncryptionException {
		if (encryptedString == null || encryptedString.trim().length() <= 0)
			throw new IllegalArgumentException("Encrypted string cant be null	or empty");

		try {
			BASE64Decoder base64decoder = new BASE64Decoder();
			byte[] uncr = base64decoder.decodeBuffer(encryptedString);
			return javaToStringFromStringBuffer(uncr);
		} catch (Exception e) {
			throw new EncryptionException(e);
		}
	}

	/**
	 * @param bytes
	 * @return
	 */
	private static String javaToStringFromStringBuffer(byte[] bytes) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			stringBuffer.append((char) bytes[i]);
		}
		return stringBuffer.toString();
	}

	/**
	 * @author C5190459
	 */
	public static class EncryptionException extends Exception {
		/**
		 * serialVersionUID
		 */
		private static final long serialVersionUID = -6247023413365790715L;

		public EncryptionException(Throwable t) {
			super(t);
		}
	}

	/**
	 *
	 */
	private static void javaXMLParse() {
		try {
			String Header = "Start";
			String EndTag = "End";
			InputStream headerStream = new ByteArrayInputStream(Header.getBytes("UTF-8"));
			InputStream EndTagStream = new ByteArrayInputStream(EndTag.getBytes("UTF-8"));
			byte[] bytesFile = Header.getBytes("UTF-8");
			InputStream is = new FileInputStream("C://Harsh//T.xml");
			byte[] bytes = new byte[headerStream.available() + is.available() + EndTagStream.available()];

			Vector<InputStream> inputstreams = new Vector<InputStream>();
			inputstreams.add(headerStream);
			inputstreams.add(is);
			inputstreams.add(EndTagStream);

			File f = new File("C://Harsh//out");

			Enumeration<InputStream> enu = inputstreams.elements();
			InputStream fileStream = new SequenceInputStream(enu);

			OutputStream out = new FileOutputStream(f);
			byte buf[] = new byte[1024];
			int len;
			while ((len = fileStream.read(buf)) > 0)
				out.write(buf, 0, len);
			out.close();
			fileStream.close();
			System.out.println("\nFile is created........");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method displays al the system variables
	 */
	private static void javaSystemDisplayAllVar() {
		java.util.Properties prop = System.getProperties();
		java.util.Enumeration enume = prop.propertyNames();
		System.out.println("***System Environment As Seen By Java********************");
		System.out.println("***Format: PROPERTY = VALUE******************************");
		for (; enume.hasMoreElements();) {
			String key = (String) enume.nextElement();
			System.out.println(key + " = " + System.getProperty(key));
		}
		System.out.println("Bootstrap files are in " + System.getProperty("sun.boot.class.path"));
		System.out.println("Extension packages or optional files are in " + System.getProperty("java.ext.dirs"));
		System.out.println("User or application specific files are in " + System.getProperty("java.class.path"));

	}

	/**
	 * This methos changes all the folder names
	 */
	private static void javaIOChangeFolderName() {
		File file = new File("Test.java");
		String str = "Harsh" + File.separator + "workspace";
		try {
			System.out.println(file.getCanonicalFile().toString().replace(File.separator, "/"));
			System.out.println(file.getCanonicalFile().toString().replace(str, "Harsh/workspace"));
		} catch (Exception e) {
		}
	}

	private static void javaCheckWordInString() {
		String str = "Harsh" + File.separator + "workspace";
		if (str.indexOf("work") != -1)
			System.out.println("Found the word");
		else
			System.out.println("Couldn't Find the Word");
	}

	/*
	 * checks whether the two arrays are equal or not
	 */
	private static void javaCheckArrayEqual() {
		String[] abc = { "Kode", "Java", "Dot", "Org" };
		String[] xyz = { "Kode", "Java", "Dot", "Org" };
		String[] java = { "Java", "Dot", "Com" };

		System.out.println(Arrays.equals(abc, xyz));
		System.out.println(Arrays.equals(abc, java));

	}

	/**
	 * @throws InterruptedException
	 */
	private static void javaSpiltUsingStringTokenizer() throws InterruptedException {
		String str = "use primitive instead of wrappersuse lazy loadingString of pool literalsBoolean b1 = new Boolean(Bollean.true)Boolean b1 = Boolean.valiueOf(Boolean.true)static block bring memory leaksgrabage collection happens for refernce which are made to nullabstract vs Interface : design concept.if already built and to extend some functionalitydiamond problem doesn't exist in java:Mutliple InheritanceInterface should be recommadedmarker interface: serializable,remote.high cohesion and low couplingif top level class is used by only one class try making it a nested class. This will help in visiblity.Final objects are synchronized. New thingminimise setter methods i.e minimise the number of changespackage dependency should be minuse enum for constantsinitialize the var and assignment at place there are used.use bigdecimal for numeric operationsBoolean b will be null and boolean b will be false";
		long l = System.currentTimeMillis();
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreElements()) {
			st.nextToken();
		}
		System.out.println(l - System.currentTimeMillis());
		l = System.currentTimeMillis();
		String strSplit[] = str.split(" ");
		int icount = strSplit.length;
		for (int i = 0; i < icount; i++) {
			System.out.println(strSplit[i]);
		}
		System.out.println(l - System.currentTimeMillis());
	}

	/**
	 *
	 */
	private static void javaStringChecking() {
		String s1 = "Hello World";
		String s2 = new String("Hello World");
		//
		// To compare string for equality we must use the equals method of
		// the string object. This ensure that the string content is compared
		// and not the object reference of the both string. This process will
		// return true as s1 and s2 have the same value.
		//
		if (s1.equals(s2)) {
			System.out.println("String is equal");
		} else {
			System.out.println("String is unequal");
		}

		//
		// Do not use the == operator to compare string for it's content, the ==
		// operator check return true only if the object has the same reference.
		// This
		// process will return false as the string references to a different
		// object.
		//
		if (s1 == s2) {
			System.out.println("String is equal");
		} else {
			System.out.println("String is unequal");
		}

	}

	/**
	 * @throws IOException
	 */
	private static void javaTimerClass() throws IOException {
		int delay = 1000;
		Timer timer = new Timer();
		System.out.println("What do you want (Certain time or Repeat time)?");
		System.out.print("Please enter \'C\' or \'R\' for that: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String ans = in.readLine();
		if (ans.equals("C") || ans.equals("c")) {
			System.out.println("C");
			timer.schedule(new TimerTask() {
				public void run() {
					System.out.println("This line is printed only once.");
				}
			}, delay);
		} else if (ans.equals("r") || ans.equals("R")) {
			System.out.println("R");
			timer.schedule(new TimerTask() {
				public void run() {
					System.out.println("This line is printed repeatedly.");
				}
			}, delay);
		} else {
			System.out.println("Invalid Entry.");
			System.exit(0);
		}
		System.exit(0);
	}

	/**
	 *
	 */
	private static void javaStringToDate() {
		DateFormat dt = new SimpleDateFormat("dd-MMM-yyyy");
		@SuppressWarnings("deprecation")
		Date today = new Date("12/23/2010");
		String strdate = dt.format(today);
		System.out.println(strdate);

	}

	/*
	 * Checks the string to have valid numeric data. in case its not numberformat
	 * exception is thrown
	 */
	private static void javaCheckStringIsValidNum() {
		String str1 = "15";
		String str2 = "15.5";
		String str3 = "15.15";
		try {
			int i = Integer.parseInt(str1);
			float f = Float.parseFloat(str2);
			double d = Double.parseDouble(str3);
			System.out.println(i + "  " + f + "  " + d + "  ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	private static void javaGetCurrentMonth() {
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		Calendar cal = Calendar.getInstance();
		String month = monthName[cal.get(Calendar.MONTH)];
		System.out.println("Month name: " + month);
	}

	/**
	 *
	 */
	private static void javaAddSubDate() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		System.out.println("Today : " + cal.getTime());
		// Substract 30 days from the calendar
		cal.add(Calendar.DATE, -30);
		System.out.println("30 days ago: " + cal.getTime());
		// Add 10 months to the calendar
		cal.add(Calendar.MONTH, 10);
		System.out.println("10 months later: " + cal.getTime());
		// Substract 1 year from the calendar
		cal.add(Calendar.YEAR, -1);
		System.out.println("1 year ago: " + cal.getTime());
	}

	private static void javaConvertArrayToCollection() {
		long l = System.currentTimeMillis();
		String str = "Happy New Year 2011";
		String strArray[] = str.split(" ");
		for (int i = 0; i < strArray.length; i++)
			System.out.println(strArray[i]);
		System.out.println(l - System.currentTimeMillis());

		l = System.currentTimeMillis();
		String[] array = { "Happy", "New", "Year", "2011" };
		List<String> list = Arrays.asList(array);
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(l - System.currentTimeMillis());
	}

	private static void javaCollectiontoArray() {
		List<Object> list = new ArrayList<Object>();
		list.add("Kode");
		list.add("Java");
		list.add("Sample");
		list.add("Code");
		Object[] array = list.toArray();
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i].toString());
	}

	private static Properties javaReadProperties(String fileName) {
		Properties prop = new Properties();
		try {
			// the configuration file name
			if (org.apache.commons.lang.StringUtils.isEmpty(fileName)) {
				fileName = "C:/Harsh/workspace/Java_1.5/util/logging/app.config";
			}
			System.out.println("File Name " + fileName);
			InputStream is = new FileInputStream(fileName);

			// load the properties file
			prop.load(is);

			// get the value for app.name key
			// System.out.println(prop.getProperty("app.name"));
			// get the value for app.version key
			// System.out.println(prop.getProperty("app.version"));

			// get the value for app.vendor key and if the
			// key is not available return Kode Java as
			// the default value
			// System.out.println(prop.getProperty("app.vendor", "Kode Java"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

	public static XMLGregorianCalendar javaGetCurrentDateinXMLGregorianCalendar() throws Exception {
		XMLGregorianCalendar xmldate = null;
		GregorianCalendar gc = new GregorianCalendar();
		Date dt = new Date();
		gc.setTime(dt);
		xmldate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		javaFormatDateFromXMLGregorianCalendar(xmldate);
		return xmldate;
	}

	public static String javaFormatDateFromXMLGregorianCalendar(XMLGregorianCalendar xmlGregoDate) {
		String strDate = null;
		if (xmlGregoDate != null) {
			XMLGregorianCalendar xmlGregorianCalendar = xmlGregoDate;
			java.util.Date dtTemp = xmlGregorianCalendar.toGregorianCalendar().getTime();
			DateFormat dtformat = new SimpleDateFormat("dd/MM/yyyy");
			strDate = dtformat.format(dtTemp);
		}

		return strDate;
	}

	public static XMLGregorianCalendar javaGetDateToXMLGregorianCalendar(String dateStr) throws Exception {
		XMLGregorianCalendar xmldate = null;
		if (dateStr != null) {
			if (!dateStr.trim().isEmpty()) {
				try {
					GregorianCalendar gc = new GregorianCalendar();
					DateFormat dtformat = new SimpleDateFormat("dd/MM/yyyy");
					Date dt = dtformat.parse(dateStr);
					gc.setTime(dt);
					xmldate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
					javaFormatDateFromXMLGregorianCalendar(xmldate);
				} catch (Exception e) {
					throw e;
				}
			}
		}
		return xmldate;
	}

	public static Integer javaConvertCharToInt(char arg) throws NumberFormatException {
		return Integer.parseInt(String.valueOf(arg));
	}

	public static Integer javaConvertStringToInt(String arg) throws NumberFormatException {
		return Integer.parseInt(arg);
	}

	public static XMLGregorianCalendar javaGetDateYYYYMMDD(String dateStr) throws Exception {
		XMLGregorianCalendar xmldate = null;
		if (dateStr != null) {
			if (!dateStr.trim().isEmpty()) {
				try {
					GregorianCalendar gc = new GregorianCalendar();
					DateFormat dtformat = new SimpleDateFormat("yyyy-MM-dd");
					Date dt = dtformat.parse(dateStr);
					gc.setTime(dt);
					xmldate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
					javaFormatDateFromXMLGregorianCalendar(xmldate);
				} catch (Exception e) {
					throw e;
				}
			}
		}
		return xmldate;
	}

	public static String javaConvertXMLGreToFormatdString(XMLGregorianCalendar xcal, String strFormat) {
		java.util.Date dt = xcal.toGregorianCalendar().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(strFormat, Locale.ITALY);
		String strDate = sdf.format(dt);
		return strDate;
	}

	public static String javaFormatDateTime(XMLGregorianCalendar xmlGregoDate) {
		String strDate = null;
		if (xmlGregoDate != null) {
			XMLGregorianCalendar xmlGregorianCalendar = xmlGregoDate;
			java.util.Date dtTemp = xmlGregorianCalendar.toGregorianCalendar().getTime();
			DateFormat dtformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			strDate = dtformat.format(dtTemp);
		}

		return strDate;
	}

	public static XMLGregorianCalendar javaConvertCalendarXMLGreg(Calendar val) throws DatatypeConfigurationException {
		GregorianCalendar gCal = (GregorianCalendar) GregorianCalendar.getInstance();
		gCal.setTimeInMillis(val.getTimeInMillis());
		XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCal);
		return xgcal;
	}

	public static Timestamp javaCurrentTimeStamp() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		Timestamp currentTime = new Timestamp(date.getTime());
		return currentTime;
	}

	public boolean javaRegexValidate(String text, String regex) {
		// pattern matching with input text
		Matcher m = javaPatternMatcher(text, regex);
		return m.matches();
	}

	public void javaValidateRegex(Object value) {
		String NUM_VAL = "[0-9]";

		/* create a mask */
		Pattern mask = Pattern.compile(NUM_VAL);
		/* retrieve the string value of the field */
		String phoneNumber = (String) value;
		/* check to ensure that the value is a phone number */
		Matcher matcher = mask.matcher(phoneNumber);
		if (!matcher.matches()) {
			System.out.println("Entered field should be numeric!");
		}
	}

	public Matcher javaPatternMatcher(final String inputVariable, final String regex) {
		// pattern matching with input String
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(inputVariable);

		return m;
	}

	private static void javaTerminateJavaApp() {
		System.exit(0);
		Runtime.getRuntime().exit(0);
	}

	public String javaGetDateAsStringFromObject(Object dateObj) {
		String retDate = null;
		try {
			if (dateObj instanceof XMLGregorianCalendar) {
				XMLGregorianCalendar xmlGregorianCalendar = (XMLGregorianCalendar) dateObj;
				java.util.Date dtTemp = xmlGregorianCalendar.toGregorianCalendar().getTime();
				DateFormat dtformat = new SimpleDateFormat("dd/MM/yyyy");
				retDate = dtformat.format(dtTemp);
			}
		} catch (Exception e) {
		}
		return retDate;
	}

	private static void javaCopyArraySomeElements() {
		// Creates letters array with 5 chars inside it.
		String[] letters = { "A", "I", "U", "E", "O" };

		// Create an array to where we are going to copy
		// some elements of the previous array.
		String[] results = new String[4];

		// Copy 3 characters from letters starting from the
		// third element and put it inside result array
		// beginning at the first element
		System.arraycopy(letters, 2, results, 1, 3);

		// Just print out what were got copied, it will
		// contains U, E, and O
		for (int i = 0; i < results.length; i++) {
			System.out.println("result = " + results[i]);
		}
	}

	private static void javaSortArray() {
		int numbers[] = { 3, 1, 8, 34, 1, 2, 13, 89, 5, 21, 55 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		System.out.println("------------------------------------");
		float money[] = { 1.05f, 99.8f, 4.55f, 3f, 7.23f, 6.50f };
		Arrays.sort(money, 2, money.length);
		for (int i = 0; i < money.length; i++)
			System.out.println(money[i]);
	}

	private static void javaFindElementInArray() {
		int items[] = { 5, 4, 6, 1, 8, 9, 6, 8, 7, 3, 2 };
		Arrays.sort(items);
		int index = Arrays.binarySearch(items, 8);
		System.out.println(index);
	}

	private static void javaSortObject() {
		Person persons[] = new Person[4];
		persons[0] = new Person("Wayan");
		persons[1] = new Person("Made");
		persons[2] = new Person("Nyoman");
		persons[3] = new Person("Ketut");
		Arrays.sort(persons);
		for (int i = 0; i < persons.length; i++) {
			Person person = persons[i];
			System.out.println("person = " + person);
		}
	}

	private static void javaPlaySound() {
		Toolkit.getDefaultToolkit().beep();
	}

	private static void javaSystemGetPathClasspath() {
		Properties properties = System.getProperties();
		String pathSeparator = properties.getProperty("path.separator");
		System.out.println("pathSeparator = " + pathSeparator);
	}

	private static void javaExecuteWindowsApplication() {
		String command = "notepad.exe";
		try {
			Process process = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void javaListJarFiles() throws IOException {
		String strFileNm = "C:\\Harsh\\temp\\ojdbc14.jar";
		JarFile jarfile = new JarFile(strFileNm);
		for (Enumeration em1 = jarfile.entries(); em1.hasMoreElements();) {
			System.out.println(em1.nextElement());
		}
		jarfile.close();
	}

	private static void javaNIOCopyFileExample(String source, String destination) throws IOException {
		if (org.apache.commons.lang.StringUtils.isEmpty(source)) {
			source = "C:\\Harsh\\workspace\\Java_1.5\\util\\medical-report.txt";
		}
		// The destination file name where data will be copied to
		if (org.apache.commons.lang.StringUtils.isEmpty(destination)) {
			destination = "C:\\Harsh\\workspace\\Java_1.5\\util\\medical-report-final.txt";
		}

		// Create an instance of FileInputStream to read the source
		// content
		FileInputStream fis = new FileInputStream(source);
		// Create an instance of FileOutputStream to write the data
		// into destination file
		FileOutputStream fos = new FileOutputStream(destination);

		// Get the FileChannel of FileInputStream instance
		FileChannel fci = fis.getChannel();
		// Get the FileChannel of FileOutputStream instance
		FileChannel fco = fos.getChannel();

		// Create a buffer with 1024 size for buffering data
		// while copying from source file to destination file.
		// To create the buffer here we used a static method
		// ByteBuffer.allocate()
		ByteBuffer buffer = ByteBuffer.allocate(1024);

		// Here we start to read the source file and write it
		// to the destionation file. We repeat this process
		// until the read method of input stream channel return
		// nothing (-1).
		while (true) {
			// read a block of data and put it in the buffer
			int read = fci.read(buffer);
			// did we reach the end of the channel? if yes
			// jump out the while-loop
			if (read == -1)
				break;
			// flip the buffer
			buffer.flip();
			// write to the destination channel
			fco.write(buffer);
			// clear the buffer and user it for the next read
			// process
			buffer.clear();
			fis.close();
			fos.close();
		}
	}

	private static void javaListZipContentAndReadFiles() {
		try {
			// Create an instance of ZipFile to read a zip file
			// called sample.zip
			ZipFile zip = new ZipFile(new File("C:\\Harsh\\temp\\struts.jar"));

			// Here we start to iterate each entries inside
			// sample.zip
			for (Enumeration e = zip.entries(); e.hasMoreElements();) {
				// Get ZipEntry which is a file or a directory
				ZipEntry entry = (ZipEntry) e.nextElement();
				// Get some information about the entry such as
				// file name, its size.
				System.out.println("File name: " + entry.getName() + "; size: " + entry.getSize()
						+ "; compressed size: " + entry.getCompressedSize());

				// Now we want to get the content of this entry.
				// Get the InputStream, we read through the input
				// stream until all the content is read.
				InputStream is = zip.getInputStream(entry);
				InputStreamReader isr = new InputStreamReader(is);

				char[] buffer = new char[1024];
				while (isr.read(buffer, 0, buffer.length) != -1) {
					String s = new String(buffer);
					// Here we just print out what is inside the
					// buffer.
					System.out.println(s.trim());
				}
			}
			zip.close();
		} catch (ZipException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void javaIOReadFileByCommon() {
		File file = new File("sample.txt");

		try {
			// Here we read a file, sample.txt, using FileUtils
			// class of commons-io-1.3.1. Using FileUtils.readLines()
			// we can read file content line by line and return
			// the result as a List of string.
			List<String> contents = FileUtils.readLines(file);

			// Iterate the result to print each line of the file.
			for (String line : contents) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void javaCollectionEmptyObject() {
		List list = Collections.EMPTY_LIST;
		Set set = Collections.EMPTY_SET;
		Map map = Collections.EMPTY_MAP;

		// For the type-safe example use the following methods.
		List<String> s = Collections.emptyList();
		Set<Long> l = Collections.emptySet();
		Map<String, Date> d = Collections.emptyMap();
	}

	/**
	 *
	 */
	private static void javaSecurityGetIpAddress() {
		try {
			InetAddress address = InetAddress.getLocalHost();
			String ip = address.getHostAddress();

			System.out.println("IP Address = " + ip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	/**
	 *
	 */
	private static void javaBooleanFromString() {
		// Parsing string "true" will result boolean true
		boolean boolA = Boolean.parseBoolean("true");
		System.out.println("boolA = " + boolA);

		// Parsing string "TRUE" also resutl boolean true, as the
		// parsing method is case insensitive
		boolean boolB = Boolean.parseBoolean("TRUE");
		System.out.println("boolB = " + boolB);

		// The operation below will return false, as Yes is not
		// a valid string value for boolean expression
		boolean boolC = Boolean.parseBoolean("Yes");
		System.out.println("boolC = " + boolC);

		// Parsing a number is also not a valid expression so the
		// parsing method return false
		boolean boolD = Boolean.parseBoolean("1");
		System.out.println("boolD = " + boolD);
	}

	// ///////////////////
	// Get number of users who had logged into the web application
	// import javax.servlet.http.HttpSessionEvent;
	// import javax.servlet.http.HttpSessionListener;
	// import javax.servlet.http.HttpSession;
	// import java.util.List;
	// import java.util.ArrayList;
	//
	// public class SessionCounter implements HttpSessionListener
	// {
	// private List sessions = new ArrayList();
	//
	// public SessionCounter()
	// {
	// }
	//
	// public void sessionCreated(HttpSessionEvent event)
	// {
	// HttpSession session = event.getSession();
	// sessions.add(session.getId());
	//
	// session.setAttribute("counter", this);
	// }
	//
	// public void sessionDestroyed(HttpSessionEvent event)
	// {
	// HttpSession session = event.getSession();
	// sessions.remove(session.getId());
	//
	// session.setAttribute("counter", this);
	// }
	//
	// public int getActiveSessionNumber()
	// {
	// return sessions.size();
	// }
	// }
	//
	// <%@ page import="org.kodejava.servlet.examples.SessionCounter" %>
	// <html>
	// <head>
	// <title>Session Counter</title>
	// </head>
	//
	// <body>
	// <%
	// SessionCounter counter = (SessionCounter) session
	// .getAttribute("counter");
	// %>
	// Number of online user(s): <%= counter.getActiveSessionNumber() %>
	// </body>
	// </html>
	//
	// <?xml version="1.0" encoding="UTF-8"?>
	// <!DOCTYPE web-app
	// PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
	// "http://java.sun.com/dtd/web-app_2_3.dtd">
	//
	// <web-app>
	// <listener>
	// <listener-class>
	// org.kodejava.servlet.examples.SessionCounter
	// </listener-class>
	// </listener>
	// </web-app>
	// ///////////////////
	// using toString from String Builder of Apache
	// import org.apache.commons.lang.builder.ToStringBuilder;
	// import org.apache.commons.lang.builder.ToStringStyle;
	//
	// public class ToStringBuilderExample
	// {
	// private String id;
	// private String firstName;
	// private String lastName;
	//
	// public ToStringBuilderExample() {}
	//
	// public String toString()
	// {
	// return new ToStringBuilder(this,
	// ToStringStyle.MULTI_LINE_STYLE)
	// .append("id", id)
	// .append("firstName", firstName)
	// .append("lastName", lastName)
	// .toString();
	// }
	//
	// public static void main(String[] args)
	// {
	// ToStringBuilderExample example =
	// new ToStringBuilderExample();
	// example.id = "1";
	// example.firstName = "First Name";
	// example.lastName = "Last Name";
	//
	// System.out.println("example = " + example);
	// }
	// }
	// ///////////////////
	// Using Spring from Servlets
	// protected void doGet(HttpServletRequest request,
	// HttpServletResponse response) throws ServletException, IOException {
	//
	// ServletContext context = getServletContext();
	// WebApplicationContext applicationContext = WebApplicationContextUtils
	// .getWebApplicationContext(context);
	//
	// Long userId = Long.valueOf(request.getParameter("user_id"));
	// UserDao dao = (UserDao) applicationContext.getBean("userDao");
	// User user = dao.getUser(userId);
	//
	// response.setContentType("text/html");
	// PrintWriter pw = response.getWriter();
	// pw.print("User Details: " + user.toString());
	// pw.flush();
	// }
	// ///////////////////
}

class SigletonClass {
	private static SigletonClass instance;

	private SigletonClass() {
	}

	public static synchronized SigletonClass getInstance() {
		if (instance == null)
			instance = new SigletonClass();
		return instance;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

class Person implements Comparable {
	private String name;

	// A constructor to Person class.
	public Person(String name) {
		this.name = name;
	}

	// Here is our compareTo implementation, here we just delegate
	// the compareTo to the string object compareTo method. The basic
	// rule for this method to return are: 0 when objects value are
	// equals; 1 if this object value is greater; and -1 if this object
	// value is smaller.
	public int compareTo(Object o) {
		Person p = (Person) o;
		return this.name.compareTo(p.name);
	}

	// Override toString() to return a readable person name.
	public String toString() {
		return name;
	}
}

class Person1 {

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class OtherPerson {
	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

/**
 * Service class which will be executed by Thread using CountDownLatch
 * synchronizer.
 */
class Service implements Runnable {
	private final String name;

	private final int timeToStart;

	private final CountDownLatch latch;

	public Service(String name, int timeToStart, CountDownLatch latch) {
		this.name = name;
		this.timeToStart = timeToStart;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(timeToStart);
		} catch (InterruptedException ex) {
		}
		System.out.println(name + " is Up");
		latch.countDown(); // reduce count of CountDownLatch by 1
	}

}

@XmlRootElement(name = "booking")
@XmlAccessorType(XmlAccessType.FIELD)
class Booking {
	@XmlElement(name = "name")
	private String name;

	@XmlElement(name = "contact")
	private int contact;

	@XmlElement(name = "startDate")
	private Date startDate;

	@XmlElement(name = "endDate")
	private Date endDate;

	@XmlElement(name = "address")
	private String address;

	public Booking() {
	}

	public Booking(String name, int contact, Date startDate, Date endDate, String address) {
		this.name = name;
		this.contact = contact;
		this.startDate = startDate;
		this.endDate = endDate;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Booking{" + "name=" + name + ", contact=" + contact + ", startDate=" + startDate + ", endDate="
				+ endDate + ", address=" + address + '}';

	}

}