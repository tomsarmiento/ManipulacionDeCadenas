public class StringManipulator{
    public Integer getIndexOrNull(String cadena, char letter){
            Integer output = cadena.indexOf(letter);
                if(output!=-1){
                    return output;
                }
                else{
                    return null;
                }
    }
}