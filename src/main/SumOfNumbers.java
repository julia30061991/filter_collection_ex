public class SumOfNumbers implements Filter {
    @Override
    public Object apply(Object o) {
        return o instanceof Integer ? (Integer) o + 10 : o;
    }
}