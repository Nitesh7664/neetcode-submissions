class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str: strs) {
            sb.append(str.length() + "#" + str);
        }
        System.out.println("sb -> " + sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList();
        System.out.println("str --> " + str);
        int i = 0;
        // Take substring till hash char and parse it to Int
        // After hashChar, take a substring from hashCharIdx + 1 -> hashCharIdx + 1 + intValue
        // Add in the list
        // 3#aab
        while(i < str.length()) {
            int j = i;
            while(str.charAt(i) != '#' && i < str.length()) i++;
            if (i <= str.length()) {
                int num = Integer.parseInt(str.substring(j, i));
                i++; // moving forward the hash
                System.out.println("num --> " + num + " subString --> " + str.substring(i, i + num));
                res.add(str.substring(i, i + num));
                i += num;
            }
        }
        return res;
    }
}
