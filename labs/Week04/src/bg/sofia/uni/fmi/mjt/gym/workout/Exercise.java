package bg.sofia.uni.fmi.mjt.gym.workout;

public record Exercise(String name, int sets, int repetitions) implements Comparable<Exercise> {

    @Override
    public int compareTo(Exercise other) {
        if (other.name() == null) {
            return 1;
        }

        return this.name().compareTo(other.name());
    }
}