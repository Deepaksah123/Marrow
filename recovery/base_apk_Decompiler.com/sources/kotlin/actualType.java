package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.CollectionType;

/* JADX INFO: loaded from: classes2.dex */
public final class actualType extends CollectionLikeType {
    private final CollectionType IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;
    private volatile boolean read;
    private CollectionType.write write;

    public actualType(_hasTypeResolver _hastyperesolver, SubTypeValidator subTypeValidator, C0170format c0170format, int i, Object obj, CollectionType collectionType) {
        super(_hastyperesolver, subTypeValidator, 2, c0170format, i, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.IconCompatParcelizer = collectionType;
    }

    public final void RemoteActionCompatParcelizer(CollectionType.write writeVar) {
        this.write = writeVar;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void B_() {
        this.read = true;
    }

    @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() throws IOException {
        if (this.RemoteActionCompatParcelizer == 0) {
            this.IconCompatParcelizer.read(this.write, C.TIME_UNSET, C.TIME_UNSET);
        }
        try {
            SubTypeValidator subTypeValidatorIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            classOf classof = new classOf(this.AudioAttributesImplBaseParcelizer, subTypeValidatorIconCompatParcelizer.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(subTypeValidatorIconCompatParcelizer));
            while (!this.read && this.IconCompatParcelizer.read(classof)) {
                try {
                } finally {
                    this.RemoteActionCompatParcelizer = classof.IconCompatParcelizer() - this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer;
                }
            }
        } finally {
            StdTypeResolverBuilder1.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        }
    }
}
