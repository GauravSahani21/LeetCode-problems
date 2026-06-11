class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int num = st.pop();
                int num2 = st.pop();
                int num3 = num + num2;

                st.push(num2);
                st.push(num);
                st.push(num3);
            } else if (operations[i].equals("D")) {
                int num = st.pop();
                st.push(num);
                st.push(num + num);
            } else if (operations[i].equals("C")) {
                st.pop();
            } else {
                int num = Integer.parseInt(operations[i]);
                st.push(num);
            }
        }
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;

    }
}
