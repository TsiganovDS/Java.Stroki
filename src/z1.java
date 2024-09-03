public class z1 {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String firstName1 = "Ivan" + " ";
        String lastName1 = "Ivanov" + " ";
        String middleName1 = "Ivanovich" + " ";
        String fullName = lastName1 + firstName1 + middleName1;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace('ё', 'е');
        System.out.println("Ф.И.О. сотрудника - " + fullName2);
    }
}
