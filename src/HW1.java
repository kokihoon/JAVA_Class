public class HW1 {
    public static void main(String[] args) {
        int ageOfClinton=46;
        int ageOfObama=59;
        int temp;

        temp=ageOfClinton;
        ageOfClinton=ageOfObama;
        ageOfObama=temp;

        System.out.println(ageOfClinton);
        System.out.println(ageOfObama);
    }
}
