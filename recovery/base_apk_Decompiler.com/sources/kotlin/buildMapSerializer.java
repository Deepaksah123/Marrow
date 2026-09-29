package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.PolymorphicTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
final class buildMapSerializer extends findCollectionLikeSerializer {
    private final int AudioAttributesCompatParcelizer;
    private final PolymorphicTypeValidator[] AudioAttributesImplApi21Parcelizer;
    private final Object[] AudioAttributesImplApi26Parcelizer;
    private final int[] IconCompatParcelizer;
    private final int MediaBrowserCompatItemReceiver;
    private final int[] read;
    private final HashMap<Object, Integer> write;

    public buildMapSerializer(Collection<? extends putObject> collection, ToStringSerializerBase toStringSerializerBase) {
        this(read(collection), AudioAttributesCompatParcelizer(collection), toStringSerializerBase);
    }

    private buildMapSerializer(PolymorphicTypeValidator[] polymorphicTypeValidatorArr, Object[] objArr, ToStringSerializerBase toStringSerializerBase) {
        super(toStringSerializerBase);
        int length = polymorphicTypeValidatorArr.length;
        this.AudioAttributesImplApi21Parcelizer = polymorphicTypeValidatorArr;
        this.IconCompatParcelizer = new int[length];
        this.read = new int[length];
        this.AudioAttributesImplApi26Parcelizer = objArr;
        this.write = new HashMap<>();
        int length2 = polymorphicTypeValidatorArr.length;
        int i = 0;
        int iAudioAttributesCompatParcelizer = 0;
        int iIconCompatParcelizer = 0;
        int i2 = 0;
        while (i < length2) {
            PolymorphicTypeValidator polymorphicTypeValidator = polymorphicTypeValidatorArr[i];
            this.AudioAttributesImplApi21Parcelizer[i2] = polymorphicTypeValidator;
            this.read[i2] = iAudioAttributesCompatParcelizer;
            this.IconCompatParcelizer[i2] = iIconCompatParcelizer;
            iAudioAttributesCompatParcelizer += polymorphicTypeValidator.AudioAttributesCompatParcelizer();
            iIconCompatParcelizer += this.AudioAttributesImplApi21Parcelizer[i2].IconCompatParcelizer();
            this.write.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.MediaBrowserCompatItemReceiver = iAudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = iIconCompatParcelizer;
    }

    final List<PolymorphicTypeValidator> read() {
        return Arrays.asList(this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // kotlin.findCollectionLikeSerializer
    protected final int AudioAttributesCompatParcelizer(int i) {
        return LaissezFaireSubTypeValidator.write(this.IconCompatParcelizer, i + 1, false, false);
    }

    @Override // kotlin.findCollectionLikeSerializer
    protected final int IconCompatParcelizer(int i) {
        return LaissezFaireSubTypeValidator.write(this.read, i + 1, false, false);
    }

    @Override // kotlin.findCollectionLikeSerializer
    protected final int AudioAttributesCompatParcelizer(Object obj) {
        Integer num = this.write.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // kotlin.findCollectionLikeSerializer
    protected final PolymorphicTypeValidator AudioAttributesImplApi26Parcelizer(int i) {
        return this.AudioAttributesImplApi21Parcelizer[i];
    }

    @Override // kotlin.findCollectionLikeSerializer
    protected final int RemoteActionCompatParcelizer(int i) {
        return this.IconCompatParcelizer[i];
    }

    @Override // kotlin.findCollectionLikeSerializer
    protected final int MediaBrowserCompatCustomActionResultReceiver(int i) {
        return this.read[i];
    }

    @Override // kotlin.findCollectionLikeSerializer
    protected final Object read(int i) {
        return this.AudioAttributesImplApi26Parcelizer[i];
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.PolymorphicTypeValidator
    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final buildMapSerializer RemoteActionCompatParcelizer(ToStringSerializerBase toStringSerializerBase) {
        PolymorphicTypeValidator[] polymorphicTypeValidatorArr = new PolymorphicTypeValidator[this.AudioAttributesImplApi21Parcelizer.length];
        for (int i = 0; i < this.AudioAttributesImplApi21Parcelizer.length; i++) {
            polymorphicTypeValidatorArr[i] = new StdArraySerializersFloatArraySerializer(this.AudioAttributesImplApi21Parcelizer[i]) { // from class: o.buildMapSerializer.1
                private final PolymorphicTypeValidator.IconCompatParcelizer read = new PolymorphicTypeValidator.IconCompatParcelizer();

                @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
                public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i2, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
                    PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(i2, audioAttributesCompatParcelizer, z);
                    if (super.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer, this.read).AudioAttributesImplApi26Parcelizer()) {
                        audioAttributesCompatParcelizerRemoteActionCompatParcelizer.read(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer.write, audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer, audioAttributesCompatParcelizer.read, audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, expectStringFormat.AudioAttributesCompatParcelizer, true);
                        return audioAttributesCompatParcelizerRemoteActionCompatParcelizer;
                    }
                    audioAttributesCompatParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer = true;
                    return audioAttributesCompatParcelizerRemoteActionCompatParcelizer;
                }
            };
        }
        return new buildMapSerializer(polymorphicTypeValidatorArr, this.AudioAttributesImplApi26Parcelizer, toStringSerializerBase);
    }

    private static Object[] AudioAttributesCompatParcelizer(Collection<? extends putObject> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends putObject> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next().AudioAttributesCompatParcelizer();
            i++;
        }
        return objArr;
    }

    private static PolymorphicTypeValidator[] read(Collection<? extends putObject> collection) {
        PolymorphicTypeValidator[] polymorphicTypeValidatorArr = new PolymorphicTypeValidator[collection.size()];
        Iterator<? extends putObject> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            polymorphicTypeValidatorArr[i] = it.next().IconCompatParcelizer();
            i++;
        }
        return polymorphicTypeValidatorArr;
    }
}
