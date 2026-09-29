package kotlin;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0011\u000b\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00052\u001a\u0010\n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000b\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000b\u0010\u000eJ\u0017\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0001\u0003\u0014\u0015\u0016"}, d2 = {"Lo/onIsLoadingChanged;", "", "<init>", "()V", "T", "Lkotlin/Function1;", "", "Lo/setTileCountVertical;", "p0", "Landroid/graphics/drawable/Drawable;", "p1", "read", "(Lo/getAnswerMap;Lo/getAnswerMap;)Lo/setTileCountVertical;", "", "()Z", "Lkotlin/Function0;", "", "AudioAttributesCompatParcelizer", "()Lo/MagicModuleSubmissionRequestBody;", "IconCompatParcelizer", "Lo/onIsLoadingChanged$AudioAttributesCompatParcelizer;", "Lo/onIsLoadingChanged$read;", "Lo/onIsLoadingChanged$IconCompatParcelizer;"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class onIsLoadingChanged {
    public static final int IconCompatParcelizer = 0;

    private onIsLoadingChanged() {
    }

    public static final class read extends onIsLoadingChanged {
        private final Drawable AudioAttributesCompatParcelizer;

        public final Drawable IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class IconCompatParcelizer extends onIsLoadingChanged {
        private final int write;

        public IconCompatParcelizer(int i) {
            super(null);
            this.write = i;
        }

        public final int write() {
            return this.write;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends onIsLoadingChanged {
        private final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;

        public final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> write() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    public final boolean read() {
        if ((this instanceof read) || (this instanceof IconCompatParcelizer)) {
            return true;
        }
        if (this instanceof AudioAttributesCompatParcelizer) {
            return false;
        }
        throw new RenewEligibleCreator();
    }

    public final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> AudioAttributesCompatParcelizer() {
        if (this instanceof AudioAttributesCompatParcelizer) {
            return ((AudioAttributesCompatParcelizer) this).write();
        }
        return null;
    }

    public final <T> setTileCountVertical<T> read(getAnswerMap<? super Integer, ? extends setTileCountVertical<T>> p0, getAnswerMap<? super Drawable, ? extends setTileCountVertical<T>> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return this instanceof read ? p1.invoke(((read) this).IconCompatParcelizer()) : this instanceof IconCompatParcelizer ? p0.invoke(Integer.valueOf(((IconCompatParcelizer) this).write())) : p1.invoke(null);
    }

    public /* synthetic */ onIsLoadingChanged(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
