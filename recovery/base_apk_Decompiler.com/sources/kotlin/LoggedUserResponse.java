package kotlin;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class LoggedUserResponse {
    public static final void IconCompatParcelizer(int i, int i2) {
        String string;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                StringBuilder sb = new StringBuilder("Both size ");
                sb.append(i);
                sb.append(" and step ");
                sb.append(i2);
                sb.append(" must be greater than zero.");
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder("size ");
                sb2.append(i);
                sb2.append(" must be greater than zero.");
                string = sb2.toString();
            }
            throw new IllegalArgumentException(string.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class read<T> extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super List<? extends T>>, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ Object AudioAttributesImplBaseParcelizer;
        private /* synthetic */ int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private Object MediaBrowserCompatMediaItem;
        private Object MediaDescriptionCompat;
        private int RatingCompat;
        private /* synthetic */ boolean RemoteActionCompatParcelizer;
        private /* synthetic */ boolean read;
        private /* synthetic */ Iterator<T> write;

        /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00c6 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b0 -> B:17:0x005f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0146 -> B:59:0x0148). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0183 -> B:71:0x0185). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 431
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.LoggedUserResponse.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
            this.write = it;
            this.RemoteActionCompatParcelizer = z;
            this.read = z2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = new read(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.read, sampleVideos);
            readVar.AudioAttributesImplBaseParcelizer = obj;
            return readVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(setStateResult<? super List<? extends T>> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final <T> Iterator<List<T>> read(Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(it, "");
        return !it.hasNext() ? TextSearchBodyResponseSource.INSTANCE : StateResult.write((MagicModuleSubmissionRequestBody) new read(i, i2, it, z2, z, null));
    }
}
