package kotlin;

import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdadecodeBitmap1 {
    public static final int AudioAttributesCompatParcelizer(int i, int i2, String str, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        toMagicModuleMetaRepoModel.write(str, "");
        _handleunrecognizedcharacterescape.IconCompatParcelizer(1857164123);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1857164123, i3, -1, "com.marrow2.core.utils.safeTabIndex (TabIndexUtils.kt:17)");
        }
        if (i2 <= 0) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            return 0;
        }
        int iWrite = getQues.write(i, 0, i2 - 1);
        if (iWrite != i) {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-992140589);
            boolean z = (((i3 & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str)) || (i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 256;
            boolean z2 = (((i3 & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i)) || (i3 & 6) == 4;
            boolean z3 = (((i3 & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i2)) || (i3 & 48) == 32;
            write writeVarOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((z3 | z | z2) || writeVarOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                writeVarOnPause = new write(str, i, i2, null);
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(writeVarOnPause);
            }
            StreamReadException.IconCompatParcelizer(Integer.valueOf(i), Integer.valueOf(i2), (MagicModuleSubmissionRequestBody) writeVarOnPause, _handleunrecognizedcharacterescape, i3 & 126);
        } else {
            _handleunrecognizedcharacterescape.IconCompatParcelizer(-993105433);
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return iWrite;
    }

    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private /* synthetic */ int IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private int read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            SdkPayloadData.IconCompatParcelizer(obj);
            String str = this.write;
            int i = this.IconCompatParcelizer;
            int i2 = this.AudioAttributesCompatParcelizer;
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                DtsReader dtsReaderRemoteActionCompatParcelizer = DtsReader.RemoteActionCompatParcelizer();
                StringBuilder sb = new StringBuilder("Tab index out of range at ");
                sb.append(str);
                sb.append(": requested=");
                sb.append(i);
                sb.append(" tabCount=");
                sb.append(i2);
                dtsReaderRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new IndexOutOfBoundsException(sb.toString()));
                C0177getRfBanners.read(getShowPopup.INSTANCE);
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(String str, int i, int i2, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.write = str;
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = new write(this.write, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            writeVar.RemoteActionCompatParcelizer = obj;
            return writeVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }
}
