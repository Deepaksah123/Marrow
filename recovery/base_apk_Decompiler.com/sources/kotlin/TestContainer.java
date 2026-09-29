package kotlin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class TestContainer implements getTopRankers<newEncryptedObject> {
    private final CharSequence IconCompatParcelizer;
    private final MagicModuleSubmissionRequestBody<CharSequence, Integer, Pair<Integer, Integer>> RemoteActionCompatParcelizer;
    private final int read;
    private final int write;

    /* JADX WARN: Multi-variable type inference failed */
    public TestContainer(CharSequence charSequence, int i, int i2, MagicModuleSubmissionRequestBody<? super CharSequence, ? super Integer, Pair<Integer, Integer>> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        this.IconCompatParcelizer = charSequence;
        this.read = i;
        this.write = i2;
        this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
    }

    public static final class AudioAttributesCompatParcelizer implements Iterator<newEncryptedObject>, getCurrentAnsweredMcqProgress {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer = -1;
        private newEncryptedObject RemoteActionCompatParcelizer;
        private int read;
        private int write;

        AudioAttributesCompatParcelizer() {
            int iWrite = getQues.write(TestContainer.this.read, 0, TestContainer.this.IconCompatParcelizer.length());
            this.read = iWrite;
            this.write = iWrite;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void write() {
            /*
                r6 = this;
                int r0 = r6.write
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.IconCompatParcelizer = r1
                r0 = 0
                r6.RemoteActionCompatParcelizer = r0
                return
            Lb:
                o.TestContainer r0 = kotlin.TestContainer.this
                int r0 = kotlin.TestContainer.AudioAttributesCompatParcelizer(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.AudioAttributesCompatParcelizer
                int r0 = r0 + r3
                r6.AudioAttributesCompatParcelizer = r0
                o.TestContainer r4 = kotlin.TestContainer.this
                int r4 = kotlin.TestContainer.AudioAttributesCompatParcelizer(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.write
                o.TestContainer r4 = kotlin.TestContainer.this
                java.lang.CharSequence r4 = kotlin.TestContainer.RemoteActionCompatParcelizer(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                o.newEncryptedObject r0 = new o.newEncryptedObject
                int r1 = r6.read
                o.TestContainer r4 = kotlin.TestContainer.this
                java.lang.CharSequence r4 = kotlin.TestContainer.RemoteActionCompatParcelizer(r4)
                int r4 = kotlin.TestGroupLSModel.write(r4)
                r0.<init>(r1, r4)
                r6.RemoteActionCompatParcelizer = r0
                r6.write = r2
                goto L9b
            L46:
                o.TestContainer r0 = kotlin.TestContainer.this
                o.MagicModuleSubmissionRequestBody r0 = kotlin.TestContainer.read(r0)
                o.TestContainer r4 = kotlin.TestContainer.this
                java.lang.CharSequence r4 = kotlin.TestContainer.RemoteActionCompatParcelizer(r4)
                int r5 = r6.write
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                o.getSubscriptionExpiresOn r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L76
                o.newEncryptedObject r0 = new o.newEncryptedObject
                int r1 = r6.read
                o.TestContainer r4 = kotlin.TestContainer.this
                java.lang.CharSequence r4 = kotlin.TestContainer.RemoteActionCompatParcelizer(r4)
                int r4 = kotlin.TestGroupLSModel.write(r4)
                r0.<init>(r1, r4)
                r6.RemoteActionCompatParcelizer = r0
                r6.write = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.RemoteActionCompatParcelizer()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.read()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.read
                o.newEncryptedObject r4 = kotlin.getQues.IconCompatParcelizer(r4, r2)
                r6.RemoteActionCompatParcelizer = r4
                int r2 = r2 + r0
                r6.read = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.write = r2
            L9b:
                r6.IconCompatParcelizer = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.TestContainer.AudioAttributesCompatParcelizer.write():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public newEncryptedObject next() {
            if (this.IconCompatParcelizer == -1) {
                write();
            }
            if (this.IconCompatParcelizer == 0) {
                throw new NoSuchElementException();
            }
            newEncryptedObject newencryptedobject = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.read(newencryptedobject, "");
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = -1;
            return newencryptedobject;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.IconCompatParcelizer == -1) {
                write();
            }
            return this.IconCompatParcelizer == 1;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.getTopRankers
    public final Iterator<newEncryptedObject> write() {
        return new AudioAttributesCompatParcelizer();
    }
}
