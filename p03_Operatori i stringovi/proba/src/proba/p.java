package proba;

public class p {

	public static void main(String[] args) {
		
		
		System.out.println("Uspesna konekcija ka bazi");
		
		String sqlselect = "SELECT * FROM korisnici";
		
						
		java.sql.Statement stmt =conn.createStatement(); 
// objekat za komunikaciju sa bazom			
			
ResultSet result = stmt.executeQuery(sqlselect); //izvrsavanje (namena)
			
		while (result.next()) {
			String ki = result.
			String lo = result.getString(3);
			String ime = result.getString(4);	
			String email = result.getString(5);	
							
			StringBuilder builder = new StringBuilder();
			builder.append("Korisnicko ime: ");
			builder.append(ki);
			builder.append("\nLozinka: ");
			builder.append(lo);
			builder.append("\nIme: ");
			builder.append(ime);
			builder.append("\nEmail: ");
			builder.append(email);
							
			System.out.println(builder.toString()); 
				}	
			}
			catch (SQLException e1)
			 {
			e1.printStackTrace();   
		}
	}
}

		
		

	}

}
