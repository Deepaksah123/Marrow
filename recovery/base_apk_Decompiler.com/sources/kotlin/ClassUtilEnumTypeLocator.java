package kotlin;

import java.io.IOException;
import java.util.Objects;
import kotlin._addRawSuperTypes;
import kotlin.findFirstAnnotatedEnumValue;

/* JADX INFO: loaded from: classes2.dex */
final class ClassUtilEnumTypeLocator extends _addRawSuperTypes {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassUtilEnumTypeLocator(final getGenericSuperclass getgenericsuperclass, int i, long j, long j2) {
        super(new _addRawSuperTypes.IconCompatParcelizer() { // from class: o.getParamCount
            @Override // o._addRawSuperTypes.IconCompatParcelizer
            public final long IconCompatParcelizer(long j3) {
                return getgenericsuperclass.AudioAttributesCompatParcelizer(j3);
            }
        }, new read(getgenericsuperclass, i, (byte) 0), getgenericsuperclass.write(), getgenericsuperclass.RatingCompat, j, j2, getgenericsuperclass.IconCompatParcelizer(), Math.max(6, getgenericsuperclass.AudioAttributesImplApi21Parcelizer));
        Objects.requireNonNull(getgenericsuperclass);
    }

    static final class read implements _addRawSuperTypes.AudioAttributesImplApi26Parcelizer {
        private final getGenericSuperclass IconCompatParcelizer;
        private final findFirstAnnotatedEnumValue.write read;
        private final int write;

        /* synthetic */ read(getGenericSuperclass getgenericsuperclass, int i, byte b) {
            this(getgenericsuperclass, i);
        }

        private read(getGenericSuperclass getgenericsuperclass, int i) {
            this.IconCompatParcelizer = getgenericsuperclass;
            this.write = i;
            this.read = new findFirstAnnotatedEnumValue.write();
        }

        @Override // o._addRawSuperTypes.AudioAttributesImplApi26Parcelizer
        public final _addRawSuperTypes.RemoteActionCompatParcelizer IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, long j) throws IOException {
            long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
            long j2 = read(closeonfailandthrowasioe);
            long jWrite = closeonfailandthrowasioe.write();
            closeonfailandthrowasioe.write(Math.max(6, this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer));
            long j3 = read(closeonfailandthrowasioe);
            long jWrite2 = closeonfailandthrowasioe.write();
            if (j2 <= j && j3 > j) {
                return _addRawSuperTypes.RemoteActionCompatParcelizer.write(jWrite);
            }
            if (j3 <= j) {
                return _addRawSuperTypes.RemoteActionCompatParcelizer.write(j3, jWrite2);
            }
            return _addRawSuperTypes.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(j2, jIconCompatParcelizer);
        }

        private long read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
            while (closeonfailandthrowasioe.write() < closeonfailandthrowasioe.read() - 6 && !findFirstAnnotatedEnumValue.RemoteActionCompatParcelizer(closeonfailandthrowasioe, this.IconCompatParcelizer, this.write, this.read)) {
                closeonfailandthrowasioe.write(1);
            }
            if (closeonfailandthrowasioe.write() >= closeonfailandthrowasioe.read() - 6) {
                closeonfailandthrowasioe.write((int) (closeonfailandthrowasioe.read() - closeonfailandthrowasioe.write()));
                return this.IconCompatParcelizer.RatingCompat;
            }
            return this.read.read;
        }
    }
}
