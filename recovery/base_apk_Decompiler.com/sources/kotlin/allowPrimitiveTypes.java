package kotlin;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class allowPrimitiveTypes extends _collectAndResolveByTypeId {
    private int AudioAttributesCompatParcelizer;
    private byte[] IconCompatParcelizer;
    private SubTypeValidator read;
    private int write;

    public allowPrimitiveTypes() {
        super(false);
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws IOException {
        write();
        this.read = subTypeValidator;
        Uri uriNormalizeScheme = subTypeValidator.AudioAttributesImplBaseParcelizer.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        buildTypeSerializer.write("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] strArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrAudioAttributesCompatParcelizer.length != 2) {
            throw SchemaAware.read("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str = strArrAudioAttributesCompatParcelizer[1];
        if (strArrAudioAttributesCompatParcelizer[0].contains(";base64")) {
            try {
                this.IconCompatParcelizer = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw SchemaAware.read("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.IconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(URLDecoder.decode(str, parseMdtaFromMeta.RemoteActionCompatParcelizer.name()));
        }
        if (subTypeValidator.AudioAttributesImplApi21Parcelizer > this.IconCompatParcelizer.length) {
            this.IconCompatParcelizer = null;
            throw new idResolver(2008);
        }
        int i = (int) subTypeValidator.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesCompatParcelizer = i;
        this.write = this.IconCompatParcelizer.length - i;
        if (subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1) {
            this.write = (int) Math.min(this.write, subTypeValidator.MediaBrowserCompatCustomActionResultReceiver);
        }
        IconCompatParcelizer(subTypeValidator);
        return subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1 ? subTypeValidator.MediaBrowserCompatCustomActionResultReceiver : this.write;
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.write;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer), this.AudioAttributesCompatParcelizer, bArr, i, iMin);
        this.AudioAttributesCompatParcelizer += iMin;
        this.write -= iMin;
        AudioAttributesCompatParcelizer(iMin);
        return iMin;
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        SubTypeValidator subTypeValidator = this.read;
        if (subTypeValidator != null) {
            return subTypeValidator.AudioAttributesImplBaseParcelizer;
        }
        return null;
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            RemoteActionCompatParcelizer();
        }
        this.read = null;
    }
}
