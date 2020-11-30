package se.lexicon.Example.Enum;

public enum Measurement {

    MILLIGRAM(0.001), GRAM(1), HECTOGRAM(100), KILOGRAM(1000);

    private final double measurementValue;

    Measurement(double value) {
        this.measurementValue = value;
    }

    public double getMeasurementValue() {
        return measurementValue;
    }
}
