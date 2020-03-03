public class StringManipulator{
    public Integer getIndexOrNull(String cadena, String cadena1){
            Integer output = cadena.indexOf(cadena1);
                if(output!=-1){
                    return output;
                }
                else{
                    return null;
                }
    }
}