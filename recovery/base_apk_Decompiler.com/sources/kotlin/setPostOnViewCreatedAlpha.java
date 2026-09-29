package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setSharedElementReturnTransition;", "p0", "Lo/checkSelfPermission;", "p1", "Lo/getAudioSessionId;", "IconCompatParcelizer", "(Lo/setSharedElementReturnTransition;Lo/checkSelfPermission;)Lo/getAudioSessionId;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setPostOnViewCreatedAlpha {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Lo/setPostOnViewCreatedAlpha$IconCompatParcelizer;", "Lo/getAudioSessionId;", "Lo/checkSelfPermission;", "", "p0", "p1", "", "write", "(II)V", "read", "(II)I", "", "IconCompatParcelizer", "(F)F", "()I", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements getAudioSessionId {
        private final /* synthetic */ checkSelfPermission IconCompatParcelizer;
        final /* synthetic */ setSharedElementReturnTransition RemoteActionCompatParcelizer;

        IconCompatParcelizer(checkSelfPermission checkselfpermission, setSharedElementReturnTransition setsharedelementreturntransition) {
            this.RemoteActionCompatParcelizer = setsharedelementreturntransition;
            this.IconCompatParcelizer = checkselfpermission;
        }

        @Override // kotlin.getAudioSessionId
        public final int write() {
            return this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }

        @Override // kotlin.getAudioSessionId
        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
        }

        @Override // kotlin.getAudioSessionId
        public final int IconCompatParcelizer() {
            performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged = (performPrimaryNavigationFragmentChanged) IntermediateLoginResponseBody.MediaMetadataCompat((List) this.RemoteActionCompatParcelizer.MediaDescriptionCompat().AudioAttributesImplBaseParcelizer());
            if (performprimarynavigationfragmentchanged != null) {
                return performprimarynavigationfragmentchanged.getIconCompatParcelizer();
            }
            return 0;
        }

        @Override // kotlin.getAudioSessionId
        public final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.MediaDescriptionCompat().getMediaMetadataCompat();
        }

        @Override // kotlin.getAudioSessionId
        public final void write(int p0, int p1) {
            this.RemoteActionCompatParcelizer.read(p0, p1, true);
        }

        @Override // kotlin.getAudioSessionId
        public final int read(int p0, int p1) {
            performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged;
            requireParentFragment requireparentfragmentMediaDescriptionCompat = this.RemoteActionCompatParcelizer.MediaDescriptionCompat();
            int iIconCompatParcelizer = 0;
            if (requireparentfragmentMediaDescriptionCompat.AudioAttributesImplBaseParcelizer().isEmpty()) {
                return 0;
            }
            int iWrite = write();
            if (p0 > IconCompatParcelizer() || iWrite > p0) {
                iIconCompatParcelizer = (requireHost.IconCompatParcelizer(requireparentfragmentMediaDescriptionCompat) * (p0 - write())) - RemoteActionCompatParcelizer();
            } else {
                List<performPrimaryNavigationFragmentChanged> listAudioAttributesImplBaseParcelizer = requireparentfragmentMediaDescriptionCompat.AudioAttributesImplBaseParcelizer();
                int size = listAudioAttributesImplBaseParcelizer.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        performprimarynavigationfragmentchanged = null;
                        break;
                    }
                    performprimarynavigationfragmentchanged = listAudioAttributesImplBaseParcelizer.get(i);
                    if (performprimarynavigationfragmentchanged.getIconCompatParcelizer() == p0) {
                        break;
                    }
                    i++;
                }
                performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged2 = performprimarynavigationfragmentchanged;
                if (performprimarynavigationfragmentchanged2 != null) {
                    iIconCompatParcelizer = performprimarynavigationfragmentchanged2.getOnCommand();
                }
            }
            return iIconCompatParcelizer + p1;
        }

        @Override // kotlin.checkSelfPermission
        public final float IconCompatParcelizer(float p0) {
            return this.IconCompatParcelizer.IconCompatParcelizer(p0);
        }
    }

    public static final getAudioSessionId IconCompatParcelizer(setSharedElementReturnTransition setsharedelementreturntransition, checkSelfPermission checkselfpermission) {
        return new IconCompatParcelizer(checkselfpermission, setsharedelementreturntransition);
    }
}
