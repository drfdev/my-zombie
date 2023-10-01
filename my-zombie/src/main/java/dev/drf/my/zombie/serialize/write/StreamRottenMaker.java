package dev.drf.my.zombie.serialize.write;

import dev.drf.my.zombie.serialize.Rotten;

import java.io.OutputStream;

public interface StreamRottenMaker<T extends Rotten> {
    void writeToStream(OutputStream stream, T value);
}
