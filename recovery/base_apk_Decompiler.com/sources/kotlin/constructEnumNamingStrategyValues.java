package kotlin;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.FileSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class constructEnumNamingStrategyValues extends SimpleDeserializers<_find, InetSocketAddressSerializer, InetAddressSerializer> implements FileSerializer {
    private final read AudioAttributesCompatParcelizer;

    public interface read {
        Bitmap RemoteActionCompatParcelizer(byte[] bArr, int i) throws InetAddressSerializer;
    }

    @Override // kotlin.SimpleDeserializers
    public final /* synthetic */ SimpleModule AudioAttributesCompatParcelizer(_find _findVar, SimpleAbstractTypeResolver simpleAbstractTypeResolver, boolean z) {
        return RemoteActionCompatParcelizer(_findVar, (InetSocketAddressSerializer) simpleAbstractTypeResolver);
    }

    @Override // kotlin.FileSerializer
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer */
    public final /* synthetic */ InetSocketAddressSerializer IconCompatParcelizer() throws InetAddressSerializer {
        return (InetSocketAddressSerializer) super.IconCompatParcelizer();
    }

    @Override // kotlin.SimpleDeserializers
    public final /* synthetic */ SimpleModule IconCompatParcelizer(Throwable th) {
        return write(th);
    }

    /* synthetic */ constructEnumNamingStrategyValues(read readVar, byte b) {
        this(readVar);
    }

    public static final class IconCompatParcelizer implements FileSerializer.read {
        private final read write = new read() { // from class: o.EnumSetSerializer
            @Override // o.constructEnumNamingStrategyValues.read
            public final Bitmap RemoteActionCompatParcelizer(byte[] bArr, int i) {
                return constructEnumNamingStrategyValues.RemoteActionCompatParcelizer(bArr, i);
            }
        };

        @Override // o.FileSerializer.read
        public final int AudioAttributesCompatParcelizer(C0170format c0170format) {
            if (c0170format.onPlayFromUri == null || !DefaultBaseTypeLimitingValidator.AudioAttributesImplBaseParcelizer(c0170format.onPlayFromUri)) {
                return buildIterableSerializer.AudioAttributesCompatParcelizer(0);
            }
            if (LaissezFaireSubTypeValidator.write(c0170format.onPlayFromUri)) {
                return buildIterableSerializer.AudioAttributesCompatParcelizer(4);
            }
            return buildIterableSerializer.AudioAttributesCompatParcelizer(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.FileSerializer.read
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public constructEnumNamingStrategyValues write() {
            return new constructEnumNamingStrategyValues(this.write, (byte) 0);
        }
    }

    private constructEnumNamingStrategyValues(read readVar) {
        super(new _find[1], new InetSocketAddressSerializer[1]);
        this.AudioAttributesCompatParcelizer = readVar;
    }

    @Override // kotlin.SimpleDeserializers
    public final _find RemoteActionCompatParcelizer() {
        return new _find(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.SimpleDeserializers
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: merged with bridge method [inline-methods] */
    public InetSocketAddressSerializer AudioAttributesImplApi26Parcelizer() {
        return new InetSocketAddressSerializer() { // from class: o.constructEnumNamingStrategyValues.1
            @Override // kotlin.SimpleAbstractTypeResolver
            public final void MediaBrowserCompatCustomActionResultReceiver() {
                constructEnumNamingStrategyValues.this.IconCompatParcelizer(this);
            }
        };
    }

    private static InetAddressSerializer write(Throwable th) {
        return new InetAddressSerializer("Unexpected decode error", th);
    }

    private InetAddressSerializer RemoteActionCompatParcelizer(_find _findVar, InetSocketAddressSerializer inetSocketAddressSerializer) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) buildTypeSerializer.IconCompatParcelizer(_findVar.read);
            buildTypeSerializer.write(byteBuffer.hasArray());
            buildTypeSerializer.IconCompatParcelizer(byteBuffer.arrayOffset() == 0);
            inetSocketAddressSerializer.RemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(byteBuffer.array(), byteBuffer.remaining());
            inetSocketAddressSerializer.write = _findVar.RemoteActionCompatParcelizer;
            return null;
        } catch (InetAddressSerializer e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap RemoteActionCompatParcelizer(byte[] bArr, int i) throws InetAddressSerializer {
        try {
            return defineDefaultImpl.RemoteActionCompatParcelizer(bArr, i);
        } catch (SchemaAware e) {
            StringBuilder sb = new StringBuilder("Could not decode image data with BitmapFactory. (data.length = ");
            sb.append(bArr.length);
            sb.append(", input length = ");
            sb.append(i);
            sb.append(")");
            throw new InetAddressSerializer(sb.toString(), e);
        } catch (IOException e2) {
            throw new InetAddressSerializer(e2);
        }
    }
}
