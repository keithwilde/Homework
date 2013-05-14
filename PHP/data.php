<html>
 <?php 
 
	
	// connects to the database 
	mysql_connect("localhost", "root", ""); 
	//sets the database
mysql_select_db("data");
	$myQuery="INSERT INTO datatable (Fname, Lname, Age, Zip, Phone, Email) VALUES('".$_POST["fname"]."','".$_POST["lname"]."','".$_POST["age"]."','".$_POST["zip"]."','".$_POST["phone"]."','".$_POST["email"]."')";	
	

	mysql_query($myQuery);
	echo "Data entered into database";
	

	
  
 ?>

</html>