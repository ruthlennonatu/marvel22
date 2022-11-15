public List findCourse(String courseName) throws SQLException {
	//Connect to the database
	Connection connect = DriverManager.getConnection(DB_URL, USER, PASS);

	//Create Query with secure parameters
	String query = "SELECT * FROM COURSES WHERE courseName = ?";

	//Prepared Statement with secure query
	PreparedStatement stmt = connect.prepareStatement(query);

	//Set the parameter value
	stmt.setString(1, courseName);

	//Execute Query
	ResultSet otput = stmt.executeQuery(query);

	//Convert ResultSet to Collection with called function
	return resultToCollection(otput);
}

private List resultToCollection(ResultSet results){
//Conversion
}