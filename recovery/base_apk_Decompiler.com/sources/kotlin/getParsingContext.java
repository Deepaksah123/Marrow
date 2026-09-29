package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\tJ\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\b\u0010\u0005J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\t\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002H&¢\u0006\u0004\b\n\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getParsingContext;", "", "T", "Lo/SwitchCompat;", "write", "()Lo/SwitchCompat;", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getParsingContext {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    <T> SwitchCompat<T> AudioAttributesCompatParcelizer();

    <T> SwitchCompat<T> AudioAttributesImplApi21Parcelizer();

    <T> SwitchCompat<T> IconCompatParcelizer();

    <T> SwitchCompat<T> RemoteActionCompatParcelizer();

    <T> SwitchCompat<T> read();

    <T> SwitchCompat<T> write();

    /* JADX INFO: renamed from: o.getParsingContext$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/getParsingContext$write;", "", "<init>", "()V", "Lo/getParsingContext;", "IconCompatParcelizer", "()Lo/getParsingContext;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

        private Companion() {
        }

        public final getParsingContext IconCompatParcelizer() {
            return RemoteActionCompatParcelizer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f"}, d2 = {"Lo/getParsingContext$RemoteActionCompatParcelizer;", "Lo/getParsingContext;", "<init>", "()V", "T", "Lo/SwitchCompat;", "write", "()Lo/SwitchCompat;", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "read", "Lo/setNavigationOnClickListener;", "", "Lo/setNavigationOnClickListener;", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer implements getParsingContext {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();
        private static final setNavigationOnClickListener<Object> IconCompatParcelizer = setVerticalGravity.write$default(compareTo.INSTANCE.RemoteActionCompatParcelizer(), compareTo.INSTANCE.AudioAttributesCompatParcelizer(), null, 4, null);

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private static final setNavigationOnClickListener<Object> AudioAttributesCompatParcelizer = setVerticalGravity.write$default(compareTo.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), compareTo.INSTANCE.AudioAttributesImplBaseParcelizer(), null, 4, null);

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private static final setNavigationOnClickListener<Object> read = setVerticalGravity.write$default(compareTo.INSTANCE.MediaDescriptionCompat(), compareTo.INSTANCE.RatingCompat(), null, 4, null);

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private static final setNavigationOnClickListener<Object> write = setVerticalGravity.write$default(compareTo.INSTANCE.read(), compareTo.INSTANCE.IconCompatParcelizer(), null, 4, null);

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private static final setNavigationOnClickListener<Object> RemoteActionCompatParcelizer = setVerticalGravity.write$default(compareTo.INSTANCE.write(), compareTo.INSTANCE.AudioAttributesImplApi21Parcelizer(), null, 4, null);

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private static final setNavigationOnClickListener<Object> MediaBrowserCompatItemReceiver = setVerticalGravity.write$default(compareTo.INSTANCE.MediaBrowserCompatItemReceiver(), compareTo.INSTANCE.AudioAttributesImplApi26Parcelizer(), null, 4, null);

        private RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.getParsingContext
        public final <T> SwitchCompat<T> write() {
            setNavigationOnClickListener<Object> setnavigationonclicklistener = IconCompatParcelizer;
            toMagicModuleMetaRepoModel.read(setnavigationonclicklistener, "");
            return setnavigationonclicklistener;
        }

        @Override // kotlin.getParsingContext
        public final <T> SwitchCompat<T> IconCompatParcelizer() {
            setNavigationOnClickListener<Object> setnavigationonclicklistener = AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.read(setnavigationonclicklistener, "");
            return setnavigationonclicklistener;
        }

        @Override // kotlin.getParsingContext
        public final <T> SwitchCompat<T> AudioAttributesImplApi21Parcelizer() {
            setNavigationOnClickListener<Object> setnavigationonclicklistener = read;
            toMagicModuleMetaRepoModel.read(setnavigationonclicklistener, "");
            return setnavigationonclicklistener;
        }

        @Override // kotlin.getParsingContext
        public final <T> SwitchCompat<T> AudioAttributesCompatParcelizer() {
            setNavigationOnClickListener<Object> setnavigationonclicklistener = write;
            toMagicModuleMetaRepoModel.read(setnavigationonclicklistener, "");
            return setnavigationonclicklistener;
        }

        @Override // kotlin.getParsingContext
        public final <T> SwitchCompat<T> RemoteActionCompatParcelizer() {
            setNavigationOnClickListener<Object> setnavigationonclicklistener = RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.read(setnavigationonclicklistener, "");
            return setnavigationonclicklistener;
        }

        @Override // kotlin.getParsingContext
        public final <T> SwitchCompat<T> read() {
            setNavigationOnClickListener<Object> setnavigationonclicklistener = MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.read(setnavigationonclicklistener, "");
            return setnavigationonclicklistener;
        }
    }
}
