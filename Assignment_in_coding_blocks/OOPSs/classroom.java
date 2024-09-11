package Assignment_in_coding_blocks.OOPSs;

public class classroom {
    public static void main(String[] args) {
        //object instance
        normal ajeet = new normal();
        ajeet.name="Ajeet";
        ajeet.ID=125;
        ajeet.section='c';
        ajeet.branch="CSE";
        ajeet.age=-9;
        ajeet.introduceYourself();
        normal aj = new normal("Ajju", -9, (char) 0, null);
        aj.introduceYourself();
    }

}
