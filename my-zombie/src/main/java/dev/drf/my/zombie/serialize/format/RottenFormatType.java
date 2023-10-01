package dev.drf.my.zombie.serialize.format;

public enum RottenFormatType {
    BITER((byte) 1),
    ;

    private final byte formatCode;

    RottenFormatType(byte formatCode) {
        this.formatCode = formatCode;
    }

    public byte getFormatCode() {
        return formatCode;
    }

    @Override
    public String toString() {
        return "RottenFormatType: "
                + name()
                + ", formatCode=" + formatCode
                + "} " + super.toString();
    }
}
