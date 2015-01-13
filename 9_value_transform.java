class ValueTransformApp {

	public static void main(String[] args) {

		/******************************** Value to String ******************************/

		// Integer
		int i_value  = 42;
		String s_i_value = Integer.toString(i_value);

		// Double
		Double d_value  = 42.0;
		String s_d_value = Double.toString(d_value);

		/******************************** String to Value ******************************/

		// Integer
		i_value = Integer.parseInt("42");

		// Float
		Float f_value = Float.parseFloat("42.0");;

		// Double
		d_value = Double.parseDouble("42.0");

		// Boolean
		Boolean b_value = Boolean.valueOf("true");
		b_value = Boolean.getBoolean("true");
		
	}

}