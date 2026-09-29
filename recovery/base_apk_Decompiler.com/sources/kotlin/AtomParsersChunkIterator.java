package kotlin;

import java.io.Serializable;
import kotlin.AtomParsersChunkIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class AtomParsersChunkIterator {
    public static <T> parseUdtaMeta<T> read(parseUdtaMeta<T> parseudtameta) {
        if ((parseudtameta instanceof RemoteActionCompatParcelizer) || (parseudtameta instanceof IconCompatParcelizer)) {
            return parseudtameta;
        }
        if (parseudtameta instanceof Serializable) {
            return new IconCompatParcelizer(parseudtameta);
        }
        return new RemoteActionCompatParcelizer(parseudtameta);
    }

    static class IconCompatParcelizer<T> implements parseUdtaMeta<T>, Serializable {
        private parseUdtaMeta<T> AudioAttributesCompatParcelizer;
        private volatile transient boolean RemoteActionCompatParcelizer;
        private transient T write;

        IconCompatParcelizer(parseUdtaMeta<T> parseudtameta) {
            this.AudioAttributesCompatParcelizer = (parseUdtaMeta) parseStsd.IconCompatParcelizer(parseudtameta);
        }

        @Override // kotlin.parseUdtaMeta
        public final T get() {
            if (!this.RemoteActionCompatParcelizer) {
                synchronized (this) {
                    if (!this.RemoteActionCompatParcelizer) {
                        T t = this.AudioAttributesCompatParcelizer.get();
                        this.write = t;
                        this.RemoteActionCompatParcelizer = true;
                        return t;
                    }
                }
            }
            return (T) parseSampleEntryEncryptionData.IconCompatParcelizer(this.write);
        }

        public final String toString() {
            Object string;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (this.RemoteActionCompatParcelizer) {
                StringBuilder sb2 = new StringBuilder("<supplier that returned ");
                sb2.append(this.write);
                sb2.append(">");
                string = sb2.toString();
            } else {
                string = this.AudioAttributesCompatParcelizer;
            }
            sb.append(string);
            sb.append(")");
            return sb.toString();
        }
    }

    static class RemoteActionCompatParcelizer<T> implements parseUdtaMeta<T> {
        private static final parseUdtaMeta<Void> RemoteActionCompatParcelizer = new parseUdtaMeta() { // from class: o.parseUdta
            @Override // kotlin.parseUdtaMeta
            public final Object get() {
                return AtomParsersChunkIterator.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        };
        private T IconCompatParcelizer;
        private volatile parseUdtaMeta<T> read;

        static /* synthetic */ Void AudioAttributesCompatParcelizer() {
            throw new IllegalStateException();
        }

        RemoteActionCompatParcelizer(parseUdtaMeta<T> parseudtameta) {
            this.read = (parseUdtaMeta) parseStsd.IconCompatParcelizer(parseudtameta);
        }

        @Override // kotlin.parseUdtaMeta
        public final T get() {
            parseUdtaMeta<T> parseudtameta = this.read;
            parseUdtaMeta<T> parseudtameta2 = (parseUdtaMeta<T>) RemoteActionCompatParcelizer;
            if (parseudtameta != parseudtameta2) {
                synchronized (this) {
                    if (this.read != parseudtameta2) {
                        T t = this.read.get();
                        this.IconCompatParcelizer = t;
                        this.read = parseudtameta2;
                        return t;
                    }
                }
            }
            return (T) parseSampleEntryEncryptionData.IconCompatParcelizer(this.IconCompatParcelizer);
        }

        public final String toString() {
            Object string = this.read;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (string == RemoteActionCompatParcelizer) {
                StringBuilder sb2 = new StringBuilder("<supplier that returned ");
                sb2.append(this.IconCompatParcelizer);
                sb2.append(">");
                string = sb2.toString();
            }
            sb.append(string);
            sb.append(")");
            return sb.toString();
        }
    }
}
