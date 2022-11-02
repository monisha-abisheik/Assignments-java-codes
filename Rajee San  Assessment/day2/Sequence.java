package day2;
import java.util.ArrayList;
import java.util.List;

public class Sequence {

      public static void sequenceOfString() {
				int start = 0, position = 0, i = 0;
				List<Integer> l = new ArrayList<>();
				String s = "IIDDIDID";
				if (s.charAt(0) == 'I') {
					l.add(1);
					l.add(2);
					start = 3;
					position = 1;
				} else {
					l.add(2);
					l.add(1);
					start = 3;
					position = 0;
				}
				System.out.println(l);
				for (i = 1; i < s.length(); i++) {
					if (s.charAt(i) == 'I') {
						l.add(start);
						start++;
						position = i + 1;

					} else {
						l.add(l.get(i));
						for (int j = position; j <= i; j++)
							l.set(j, l.get(j) + 1);
						start++;// 4
					}
					System.out.println(l);
				}
				for (i = 0; i < l.size(); i++)
					System.out.print(l.get(i));
				System.out.println();
			}

			public static void main(String[] args) {
				Sequence.sequenceOfString();

			}

		
	}

