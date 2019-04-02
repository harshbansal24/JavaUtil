package org.harsh.util;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

/**
 * AllJQueryCode class is a utility class for UI stuff by Harsh Bansal
 *
 * @author Harsh Bansal
 */
public class AllJQueryCode extends Thread implements Serializable {
	private static final long serialVersionUID = -3824126402222342743L;

	static String strFileNm = "D:" + File.separator + "Harsh" + File.separator + "read.xls";

	static Logger logger = Logger.getLogger("AllJavaCode");

	public static void main(String[] args) {
		logger.info(new Date() + " START " + Runtime.getRuntime().freeMemory());
		jqueryDetectIfEnterKeyIsPressed();
		logger.info(new Date() + " END " + Runtime.getRuntime().freeMemory());
	}

	/**
	 * â€œENTERâ€� key is represented by code â€œ13â€³. check this ASCII charts. To check whether user pressed ENTER key on
	 * webpage or on any input element, you can bind keypress or keydown event to that element or document object
	 * itself. Then in bind function check the keycode of pressed key whether itâ€™s value is 13 is not. If itâ€™s 13, then
	 * â€œENTERâ€� key was pressed otherwise simply not.
	 *
	 * http://howtodoinjava.com/2013/12/24/jquery-detect-if-enter-key-is-pressed/
	 */
	private static void jqueryDetectIfEnterKeyIsPressed() {
		// <html>
		// <head>
		// <script type="text/javascript" src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
		// </head>
		// <body>
		// <h1>Detect ENTER key with jQuery</h1>
		// <label>TextBox Area: </label>
		// <input id="someTextBox" type="text" size="40" />
		// <script type="text/javascript">
		// //Bind keypress event to textbox
		// $('#someTextBox').keypress(function(event){
		// var keycode = (event.keyCode ? event.keyCode : event.which);
		// if(keycode == '13'){
		// alert('You pressed a "enter" key in textbox');
		// }
		// //Stop the event from propogation to other handlers
		// //If this line will be removed, then keypress event handler attached
		// //at document level will also be triggered
		// event.stopPropagation();
		// });
		//
		// //Bind keypress event to document
		// $(document).keypress(function(event){
		// var keycode = (event.keyCode ? event.keyCode : event.which);
		// if(keycode == '13'){
		// alert('You pressed a "enter" key in somewhere');
		// }
		// });
		// </script>
		// </body>
		// </html>
	}

}