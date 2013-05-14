<html>
 <?php 
 	$name = $_GET["nameField"];
	$score = $_GET["scoreField"];
	// connects to the database 
	mysql_connect("localhost", "root", ""); 
	//sets the database
mysql_select_db("hangman");
	$myQuery="INSERT INTO scores (Name, Score) 
	VALUES ('".$name."','".$score."')";
	mysql_query($myQuery);
	echo "Score entered for ".$name;
  
 ?>

</html>