package kotlin;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0001\u0010\u0005\"(\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0001@\u0000X\u0080\f¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b"}, d2 = {"Lo/ViewPager2SavedState;", "AudioAttributesCompatParcelizer", "()Lo/ViewPager2SavedState;", "Landroid/view/inputmethod/EditorInfo;", "", "(Landroid/view/inputmethod/EditorInfo;)V", "Lkotlin/Function1;", "Landroid/view/View;", "Lo/ViewPagerSavedState;", "read", "Lo/getAnswerMap;", "()Lo/getAnswerMap;", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getWindowAreaDisplayMetrics {
    private static getAnswerMap<? super View, ? extends ViewPagerSavedState> read = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<View, ViewPagerLayoutParams> {
        public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final ViewPagerLayoutParams invoke(View view) {
            return new ViewPagerLayoutParams(view);
        }

        AudioAttributesCompatParcelizer() {
            super(1, ViewPagerLayoutParams.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }
    }

    public static final getAnswerMap<View, ViewPagerSavedState> read() {
        return read;
    }

    public static final ViewPager2SavedState AudioAttributesCompatParcelizer() {
        return new getRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(EditorInfo editorInfo) {
        if (_booleanType.read()) {
            _booleanType.AudioAttributesCompatParcelizer().read(editorInfo);
        }
    }
}
