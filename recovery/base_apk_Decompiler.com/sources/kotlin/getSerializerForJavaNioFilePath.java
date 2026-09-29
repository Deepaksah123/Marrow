package kotlin;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class getSerializerForJavaNioFilePath {

    public static final class write implements getTopRankers<View> {
        final /* synthetic */ ViewGroup write;

        public write(ViewGroup viewGroup) {
            this.write = viewGroup;
        }

        @Override // kotlin.getTopRankers
        public final Iterator<View> write() {
            return new InvalidFormatException(getSerializerForJavaNioFilePath.read(this.write).write(), AnonymousClass4.read);
        }
    }

    public static final class IconCompatParcelizer implements Iterator<View>, isModuleGeneratedVisible {
        final /* synthetic */ ViewGroup AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        IconCompatParcelizer(ViewGroup viewGroup) {
            this.AudioAttributesCompatParcelizer = viewGroup;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.RemoteActionCompatParcelizer < this.AudioAttributesCompatParcelizer.getChildCount();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.AudioAttributesCompatParcelizer;
            int i = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            ViewGroup viewGroup = this.AudioAttributesCompatParcelizer;
            int i = this.RemoteActionCompatParcelizer - 1;
            this.RemoteActionCompatParcelizer = i;
            viewGroup.removeViewAt(i);
        }
    }

    public static final Iterator<View> RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        return new IconCompatParcelizer(viewGroup);
    }

    public static final class read implements getTopRankers<View> {
        final /* synthetic */ ViewGroup IconCompatParcelizer;

        read(ViewGroup viewGroup) {
            this.IconCompatParcelizer = viewGroup;
        }

        @Override // kotlin.getTopRankers
        public final Iterator<View> write() {
            return getSerializerForJavaNioFilePath.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
    }

    public static final getTopRankers<View> read(ViewGroup viewGroup) {
        return new read(viewGroup);
    }

    /* JADX INFO: renamed from: o.getSerializerForJavaNioFilePath$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "p0", "", "read", "(Landroid/view/View;)Ljava/util/Iterator;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<View, Iterator<? extends View>> {
        public static final AnonymousClass4 read = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(View view) {
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                return getSerializerForJavaNioFilePath.read(viewGroup).write();
            }
            return null;
        }

        AnonymousClass4() {
            super(1);
        }
    }

    public static final getTopRankers<View> IconCompatParcelizer(ViewGroup viewGroup) {
        return new write(viewGroup);
    }
}
