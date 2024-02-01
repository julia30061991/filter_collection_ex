public class SumOfNumbers implements Filter {
    @Override
    public Object apply(Object o) {
        return ((Integer)o + 10);
    }
}