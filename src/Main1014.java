
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Main1014 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Integer> collect = null;
//        try{
//            collect = Arrays.stream(scanner.nextLine().split(",")).map(Integer::valueOf).sorted().collect(Collectors.toList());
//        }catch(Exception e){
//            System.out.println(-1);
//            return;
//        }
//        if (new HashSet<Integer>(collect).size()!=4){
//            System.out.println(-1);
//            return;
//        }
//        if (collect.contains(5)&&collect.contains(2)){
//            System.out.println(-1);
//            return;
//        }
//        if (collect.contains(6)&&collect.contains(9)){
//            System.out.println(-1);
//            return;
//        }
//        if (collect.get(0)<1){
//            System.out.println(-1);
//            return;
//        }
//        if (collect.get(3)>9){
//            System.out.println(-1);
//            return;
//        }
//
//        final Integer max = collect.get(3);
//        if (collect.contains(6)){
//            collect.add(9);
//        }
//        if (collect.contains(9)){
//            collect.add(6);
//        }
//        if (collect.contains(5)){
//            collect.add(2);
//        }
//        if (collect.contains(2)){
//            collect.add(5);
//        }
//        final int size = collect.size();
//        for (int i = 0; i < size; i++) {
//            for (int i1 = 0; i1 < size; i1++) {
//                if (i==i1){
//                    continue;
//                }
//                collect.add(collect.get(i)*10+collect.get(i1));
//            }
//        }
//        final ArrayList<Integer> re = new ArrayList<>();
//        re.add(25);
//        re.add(52);
//        re.add(69);
//        re.add(96);
//        collect.removeAll(re);
//        collect.sort(Comparator.comparingInt(f -> f));
//        System.out.println(collect.get(max-1));
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            final char[] chars = scanner.nextLine().toCharArray();
            Deque<Character> deque = new ArrayDeque<>();
            for (char aChar : chars) {
                if ((aChar>='a'&&aChar<='z') || (aChar>='A'&&aChar<='Z')){
                    if (!deque.isEmpty()&&deque.getLast().equals(aChar)){
                        deque.removeLast();
                        continue;
                    }
                    deque.add(aChar);
                }else {
                    System.out.println(0);
                    break;
                }
            }
            System.out.println(deque.size());
        }

    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        final int N = scanner.nextInt();
//        int [] buf = new int[N];
//        for (int i1 = 0; i1 < buf.length; i1++) {
//            buf[i1]=scanner.nextInt();
//        }
//        final int M = scanner.nextInt();
//        int all = 0;
//        for (int i = 0; i < M; i++) {
//            all+=buf[i];
//        }
//        int res = all;
//        for (int i = M; i < N; i++) {
//            all=all-buf[i-M]+buf[i];
//            res= Math.max(res,all);
//        }
//        System.out.println(res);
//    }
}
