package p8;

public class CouldNotBuildCarException extends RuntimeException {
    public CouldNotBuildCarException(UnknownCarPartException e) {
        super(e);
    }
}
