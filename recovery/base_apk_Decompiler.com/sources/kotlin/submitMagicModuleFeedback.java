package kotlin;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class submitMagicModuleFeedback implements getTopRankers<String> {
    private final BufferedReader write;

    public submitMagicModuleFeedback(BufferedReader bufferedReader) {
        toMagicModuleMetaRepoModel.write(bufferedReader, "");
        this.write = bufferedReader;
    }

    public static final class write implements Iterator<String>, getCurrentAnsweredMcqProgress {
        private String IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;

        write() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            if (this.IconCompatParcelizer == null && !this.RemoteActionCompatParcelizer) {
                String line = submitMagicModuleFeedback.this.write.readLine();
                this.IconCompatParcelizer = line;
                if (line == null) {
                    this.RemoteActionCompatParcelizer = true;
                }
            }
            return this.IconCompatParcelizer != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.IconCompatParcelizer;
            this.IconCompatParcelizer = null;
            toMagicModuleMetaRepoModel.write((Object) str);
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.getTopRankers
    public final Iterator<String> write() {
        return new write();
    }
}
