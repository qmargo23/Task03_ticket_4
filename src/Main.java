class Main {
    public static void main(String[] args) {
//Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.
/* дан массив {one, two, four, two, one}
  должны получить {one, two,four}*/

        String[] arrString = {"one", "two", "four", "two", "one", "four", "two", "one", "five","two" , "four"};
        System.out.print("дан массив  ");
        for (String s : arrString) {
            System.out.print("  " + s);
        }
        int c = 0;// счетчик повторов
        for (int i = 0; i < arrString.length; i++) {
            for (int j = i+1; j < arrString.length; j++) {
                if (arrString[i].equals("_")){continue;}
                if (arrString[i].equals(arrString[j])) {
                    c++;
                    arrString[j] = "_";
                }
            }
        }
        System.out.println();
        String text = "";
        int id = arrString.length - c;
        String[] arrNew = new String[id];
        int k = 0;
        for (String s : arrString) {
            if (s != "_") {
                arrNew[k] = s;//если надо создать массив
                text = text + arrNew[k];//если надо создать строку
                k++;
            }
        }
        System.out.println("text = " + text);
        System.out.print("массив = ");
        for (String s : arrNew) {
            System.out.print("  " + s);
        }
    }
}
