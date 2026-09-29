package kotlin;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface getQuote extends Iterable<dummyEditor>, getCurrentAnsweredMcqProgress {
    public static final AudioAttributesCompatParcelizer IconCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer;

    boolean AudioAttributesCompatParcelizer(getNotesCount getnotescount);

    dummyEditor IconCompatParcelizer(getNotesCount getnotescount);

    boolean RemoteActionCompatParcelizer();

    public static final class read {
        public static dummyEditor RemoteActionCompatParcelizer(getQuote getquote, getNotesCount getnotescount) {
            dummyEditor next;
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            Iterator<dummyEditor> it = getquote.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(next.write(), getnotescount)) {
                    break;
                }
            }
            return next;
        }

        public static boolean write(getQuote getquote, getNotesCount getnotescount) {
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            return getquote.IconCompatParcelizer(getnotescount) != null;
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        static final /* synthetic */ AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer();
        private static final getQuote RemoteActionCompatParcelizer = new C0101AudioAttributesCompatParcelizer();

        /* JADX INFO: renamed from: o.getQuote$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
        public static final class C0101AudioAttributesCompatParcelizer implements getQuote {
            @Override // kotlin.getQuote
            public final boolean RemoteActionCompatParcelizer() {
                return true;
            }

            C0101AudioAttributesCompatParcelizer() {
            }

            @Override // kotlin.getQuote
            public final boolean AudioAttributesCompatParcelizer(getNotesCount getnotescount) {
                return read.write(this, getnotescount);
            }

            @Override // kotlin.getQuote
            public final /* synthetic */ dummyEditor IconCompatParcelizer(getNotesCount getnotescount) {
                read(getnotescount);
                return null;
            }

            @Override // java.lang.Iterable
            public final Iterator<dummyEditor> iterator() {
                return IntermediateLoginResponseBody.RemoteActionCompatParcelizer().iterator();
            }

            public final String toString() {
                return "EMPTY";
            }

            private static Void read(getNotesCount getnotescount) {
                toMagicModuleMetaRepoModel.write(getnotescount, "");
                return null;
            }
        }

        private AudioAttributesCompatParcelizer() {
        }

        public static getQuote read() {
            return RemoteActionCompatParcelizer;
        }

        public static getQuote RemoteActionCompatParcelizer(List<? extends dummyEditor> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            return list.isEmpty() ? RemoteActionCompatParcelizer : new getVideoIntro(list);
        }
    }
}
