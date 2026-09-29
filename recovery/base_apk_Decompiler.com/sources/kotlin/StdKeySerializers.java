package kotlin;

import android.os.Handler;
import java.io.IOException;
import kotlin._fromClass;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public interface StdKeySerializers {

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(StdKeySerializers stdKeySerializers, PolymorphicTypeValidator polymorphicTypeValidator);
    }

    default boolean RemoteActionCompatParcelizer() {
        return true;
    }

    void addDrmEventListener(Handler handler, PropertySerializerMapEmpty propertySerializerMapEmpty);

    void addEventListener(Handler handler, StdKeySerializer stdKeySerializer);

    default boolean canUpdateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        return false;
    }

    StdJdkSerializersAtomicIntegerSerializer createPeriod(write writeVar, _findWellKnownSimple _findwellknownsimple, long j);

    void disable(IconCompatParcelizer iconCompatParcelizer);

    void enable(IconCompatParcelizer iconCompatParcelizer);

    JsonSerializableSchema getMediaItem();

    void maybeThrowSourceInfoRefreshError() throws IOException;

    void prepareSource(IconCompatParcelizer iconCompatParcelizer, TypeNameIdResolver typeNameIdResolver, modifyArraySerializer modifyarrayserializer);

    default PolymorphicTypeValidator read() {
        return null;
    }

    void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer);

    void releaseSource(IconCompatParcelizer iconCompatParcelizer);

    void removeDrmEventListener(PropertySerializerMapEmpty propertySerializerMapEmpty);

    void removeEventListener(StdKeySerializer stdKeySerializer);

    default void updateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
    }

    public interface AudioAttributesCompatParcelizer {
        default AudioAttributesCompatParcelizer IconCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
            return this;
        }

        default AudioAttributesCompatParcelizer read(_fromClass.IconCompatParcelizer iconCompatParcelizer) {
            return this;
        }

        AudioAttributesCompatParcelizer read(_resolveSuperClass _resolvesuperclass);

        AudioAttributesCompatParcelizer write(SimpleBeanPropertyFilter simpleBeanPropertyFilter);

        @Deprecated
        default AudioAttributesCompatParcelizer write(boolean z) {
            return this;
        }

        StdKeySerializers write(JsonSerializableSchema jsonSerializableSchema);

        static {
            StdKeySerializersDefault stdKeySerializersDefault = StdKeySerializersDefault.write;
        }
    }

    public static final class write {
        public final Object AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final long RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        public write(Object obj) {
            this(obj, -1L);
        }

        public write(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public write(Object obj, long j, int i) {
            this(obj, -1, -1, j, i);
        }

        public write(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, -1);
        }

        private write(Object obj, int i, int i2, long j, int i3) {
            this.AudioAttributesCompatParcelizer = obj;
            this.write = i;
            this.read = i2;
            this.RemoteActionCompatParcelizer = j;
            this.IconCompatParcelizer = i3;
        }

        public final write RemoteActionCompatParcelizer(Object obj) {
            return this.AudioAttributesCompatParcelizer.equals(obj) ? this : new write(obj, this.write, this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
        }

        public final boolean IconCompatParcelizer() {
            return this.write != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write writeVar = (write) obj;
            return this.AudioAttributesCompatParcelizer.equals(writeVar.AudioAttributesCompatParcelizer) && this.write == writeVar.write && this.read == writeVar.read && this.RemoteActionCompatParcelizer == writeVar.RemoteActionCompatParcelizer && this.IconCompatParcelizer == writeVar.IconCompatParcelizer;
        }

        public final int hashCode() {
            int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
            int i = this.write;
            return ((((((((iHashCode + 527) * 31) + i) * 31) + this.read) * 31) + ((int) this.RemoteActionCompatParcelizer)) * 31) + this.IconCompatParcelizer;
        }
    }
}
