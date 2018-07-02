<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<title></title>
<script type="text/javascript" src="js/jquery.js"></script>


<style type="text/css">

#dialog-overlay {

	/* set it to fill the whil screen */
	width:100%; 
	height:100%;
	
	/* transparency for different browsers */
	filter:alpha(opacity=50); 
	-moz-opacity:0.5; 
	-khtml-opacity: 0.5; 
	opacity: 0.5; 
	background:#000; 

	/* make sure it appear behind the dialog box but above everything else */
	position:absolute; 
	top:0; left:0; 
	z-index:3000; 

	/* hide it by default */
	display:none;
}

#delete-overlay {

	/* set it to fill the whil screen */
	width:100%; 
	height:100%;
	
	/* transparency for different browsers */
	filter:alpha(opacity=50); 
	-moz-opacity:0.5; 
	-khtml-opacity: 0.5; 
	opacity: 0.5; 
	background:#000; 

	/* make sure it appear behind the dialog box but above everything else */
	position:absolute; 
	top:0; left:0; 
	z-index:3000; 

	/* hide it by default */
	display:none;
}
#folder-overlay {

	/* set it to fill the whil screen */
	width:100%; 
	height:100%;
	
	/* transparency for different browsers */
	filter:alpha(opacity=50); 
	-moz-opacity:0.5; 
	-khtml-opacity: 0.5; 
	opacity: 0.5; 
	background:#000; 

	/* make sure it appear behind the dialog box but above everything else */
	position:absolute; 
	top:0; left:0; 
	z-index:3000; 

	/* hide it by default */
	display:none;
}

#dialog-box {
	
	/* css3 drop shadow */
	-webkit-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
	-moz-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
	
	/* css3 border radius */
	-moz-border-radius: 5px;
    -webkit-border-radius: 5px;
	
	background:#eee;
	/* styling of the dialog box, i have a fixed dimension for this demo */ 
	width:328px; 
	
	/* make sure it has the highest z-index */
	position:absolute; 
	z-index:5000; 

	/* hide it by default */
	display:none;
}
#delete-box {
	
	/* css3 drop shadow */
	-webkit-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
	-moz-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
	
	/* css3 border radius */
	-moz-border-radius: 5px;
    -webkit-border-radius: 5px;
	
	background:#eee;
	/* styling of the dialog box, i have a fixed dimension for this demo */ 
	width:328px; 
	
	/* make sure it has the highest z-index */
	position:absolute; 
	z-index:5000; 

	/* hide it by default */
	display:none;
}
#folder-box {
	
	/* css3 drop shadow */
	-webkit-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
	-moz-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
	
	/* css3 border radius */
	-moz-border-radius: 5px;
    -webkit-border-radius: 5px;
	
	background:#eee;
	/* styling of the dialog box, i have a fixed dimension for this demo */ 
	width:328px; 
	
	/* make sure it has the highest z-index */
	position:absolute; 
	z-index:5000; 

	/* hide it by default */
	display:none;
}
#dialog-box .dialog-content {
	/* style the content */
	text-align:left; 
	padding:10px; 
	margin:13px;
	color:#666; 
	font-family:arial;
	font-size:11px; 
}
#delete-box .delete-content {
	/* style the content */
	text-align:left; 
	padding:10px; 
	margin:13px;
	color:#666; 
	font-family:arial;
	font-size:11px; 
}
#folder-box .folder-content {
	/* style the content */
	text-align:left; 
	padding:10px; 
	margin:13px;
	color:#666; 
	font-family:arial;
	font-size:11px; 
}
a.button {
	/* styles for button */
	margin:10px auto 0 auto;
	text-align:center;
	background-color: #e33100;
	display: block;
	width:50px;
	padding: 5px 10px 6px;
	color: #fff;
	text-decoration: none;
	font-weight: bold;
	line-height: 1;
	
	/* css3 implementation :) */
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	-moz-box-shadow: 0 1px 3px rgba(0,0,0,0.5);
	-webkit-box-shadow: 0 1px 3px rgba(0,0,0,0.5);
	text-shadow: 0 -1px 1px rgba(0,0,0,0.25);
	border-bottom: 1px solid rgba(0,0,0,0.25);
	position: relative;
	cursor: pointer;
	
}

a.button:hover {
	background-color: #c33100;	
}

/* extra styling */
#dialog-box .dialog-content p {
	font-weight:700; margin:0;
}
#delete-box .delete-content p {
	font-weight:700; margin:0;
}
#folder-box .folder-content p {
	font-weight:700; margin:0;
}
#dialog-box .dialog-content ul {
	margin:10px 0 10px 20px; 
	padding:0; 
	height:50px;
}

#delete-box .delete-content ul {
	margin:10px 0 10px 20px; 
	padding:0; 
	height:50px;
}
#folder-box .folder-content ul {
	margin:10px 0 10px 20px; 
	padding:0; 
	height:50px;
}

.button {
  color: #FFF;
  background-color: #900;
  font-weight: bold;
}
.button:hover {
	background-color: #c33100;	
}
</style>

<script type="text/javascript">

$(document).ready(function () {

	// if user clicked on button, the overlay layer or the dialogbox, close the dialog	
	$('#close').click(function () {		
			$('#dialog-overlay, #dialog-box').hide();
			//alert("in close function");
			return false;
		});
	// if user clicked on button, the overlay layer or the dialogbox, close the dialog	
	$('#closed').click(function () {		
			$('#delete-overlay, #delete-box').hide();
			//alert("in close function");
			return false;
		});
	$('#closef').click(function () {		
			$('#folder-overlay, #folder-box').hide();
			//alert("in close function");
			return false;
		});
	
	$('#addFileBox').click(function () {		
		
			var element = document.getElementById('addFileBox');
			var new_el = document.createElement("input");
			new_el.setAttribute("type", "file");
			new_el.setAttribute("name", "file_up[]");
			new_el.setAttribute("value", "");
			document.getElementById("uploadform").insertBefore(new_el, element);
			popup();
			return false;
		});
	$('#upload').click(function () {		
			$('#dialog-overlay, #dialog-box').hide();
			alert("uploading");
			return false;
		});
	$('#file').click(function () {		
			//$('#dialog-overlay, #dialog-box').hide();
			//alert("in file windows");
			popup();
			return false;
		});
	$('#delete').click(function () {		
			//$('#dialog-overlay, #dialog-box').hide();
			alert("Delete files");
			
			return false;
		});
	$('#add').click(function () {		
			//$('#dialog-overlay, #dialog-box').hide();
			alert("Add a folder");
			
			return false;
		});
	// if user resize the window, call the same function again
	// to make sure the overlay fills the screen and dialogbox aligned to center	
	$(window).resize(function () {
		
		//only do it if the dialog box is not hidden
		if (!$('#dialog-box').is(':hidden')) popup();		
	});	
	
	
});

//Popup dialog
function uploadup(message) {
		
	// get the screen height and width  
	var maskHeight = $(document).height();  
	var maskWidth = $(window).width();
	
	// calculate the values for center alignment
	var dialogTop =  (maskHeight/3) - ($('#dialog-box').height());  
	var dialogLeft = (maskWidth/2) - ($('#dialog-box').width()/2); 
	
	// assign values to the overlay and dialog box
	$('#dialog-overlay').css({height:maskHeight, width:maskWidth}).show();
	$('#dialog-box').css({top:dialogTop, left:dialogLeft}).show();

	$('#dialog-message').html(message);
	
			
}
function deleteup(message) {
		
	// get the screen height and width  
	var maskHeight = $(document).height();  
	var maskWidth = $(window).width();
	
	// calculate the values for center alignment
	var dialogTop =  (maskHeight/3) - ($('#delete-box').height());  
	var dialogLeft = (maskWidth/2) - ($('#delete-box').width()/2); 
	
	// assign values to the overlay and dialog box
	$('#delete-overlay').css({height:maskHeight, width:maskWidth}).show();
	$('#delete-box').css({top:dialogTop, left:dialogLeft}).show();

	$('#delete-message').html(message);
	
			
}

function folderup(message) {
		
	// get the screen height and width  
	var maskHeight = $(document).height();  
	var maskWidth = $(window).width();
	
	// calculate the values for center alignment
	var dialogTop =  (maskHeight/3) - ($('#folder-box').height());  
	var dialogLeft = (maskWidth/2) - ($('#folder-box').width()/2); 
	
	// assign values to the overlay and dialog box
	$('#folder-overlay').css({height:maskHeight, width:maskWidth}).show();
	$('#folder-box').css({top:dialogTop, left:dialogLeft}).show();

	$('#folder-message').html(message);
	
			
}
// Function that sends form data, by passing them to an iframe
function uploading(theform){
  // Adds the code for the iframe
  //document.getElementById('uploadform').innerHTML = '<iframe id="uploadframe" name="uploadframe" src="uploader.php" frameborder="0"></iframe>';

  theform.submit();		// Executa trimiterea datelor
//alert('uploading');
  // Restore the form
  //document.getElementById('uploadform').innerHTML = '<input type="file" id="test" class="file_up" name="file_up[]" />';
  return false;
}
</script>

</head>
<body>

<!--a href="javascript:popup()">UPLoading files</a-->
<input type ="button" class="button" value="Uploading files" onclick="javascript:uploadup()"/>
<div id="dialog-overlay"></div>
<div id="dialog-box">
	<div class="dialog-content">
		<div id="dialog-message"></div>
		
		
		<form id="uploadform" action="popup.html" method="post" enctype="multipart/form-data" target="uploadframe" >
		
		<div id="adddiv"></div>
		<script type="text/javascript" src="upload.js"></script>
		<input type ="submit"  class="button" id='addFileBox' value ='Add more files' ></button>
		 <a href="#" class="button" id='upload'>UPLOAD</a>
		 <a href="#" class="button" id='close'>CLOSE</a>
		</form>

	</div>
</div>


<!--a href="javascript:deleteup()">Delete files </a-->
<input type ="button" class="button" value="Delete files" onclick="javascript:deleteup()"/>
<div id="delete-overlay"></div>
<div id="delete-box">
	<div class="delete-content">
		<div id="delete-message"></div>
		
		
		<form id="deleteform" action="popup.html" method="post" enctype="multipart/form-data"  target="uploadframe">
		
		<div id="deletediv"></div>
		
		
		 <a href="#" class="button" id='delete'>DELETE</a>
		 <a href="#" class="button" id='closed'>CLOSE</a>
		</form>

	</div>
</div>

<!--a href="javascript:folderup()">Add a folder </a-->
<input type ="button" class="button" value="Add a folder" onclick="javascript:folderup()"/>
<div id="folder-overlay"></div>
<div id="folder-box">
	<div class="folder-content">
		<div id="folder-message"></div>
		
		
		<form id="folderform" action="popup.html" method="post" enctype="multipart/form-data"  target="uploadframe">
		
		<div id="folderdiv"></div>
		Enter a foldr name: 
		<input type="text" name = "folder_name" id="folder_name"/>
		 <a href="#" class="button" id='add'>ADD a folder</a>
		 <a href="#" class="button" id='closef'>CLOSE</a>
		</form>

	</div>
</div>

</body>
</html>