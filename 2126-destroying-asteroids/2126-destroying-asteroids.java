class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long Mass = mass;

        for (int i = 0; i < asteroids.length; i++) {

            if (Mass < asteroids[i]) {
                return false;
            }
            Mass += asteroids[i];
        }

        return true;
    }
}