package kotlin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class parseSidx<K0, V0> {
    /* synthetic */ parseSidx(byte b) {
        this();
    }

    private parseSidx() {
    }

    public static write<Object> read() {
        return RemoteActionCompatParcelizer();
    }

    private static write<Object> RemoteActionCompatParcelizer() {
        FixedSampleSizeRechunker.IconCompatParcelizer(8, "expectedKeys");
        return new write<Object>(8) { // from class: o.parseSidx.4
            private /* synthetic */ int IconCompatParcelizer = 8;

            @Override // o.parseSidx.write
            final <K, V> Map<K, Collection<V>> write() {
                return parseTrex.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            }
        };
    }

    public static write<Comparable> IconCompatParcelizer() {
        return read(parseTruns.IconCompatParcelizer());
    }

    private static <K0> write<K0> read(final Comparator<K0> comparator) {
        return new write<K0>() { // from class: o.parseSidx.3
            @Override // o.parseSidx.write
            final <K extends K0, V> Map<K, Collection<V>> write() {
                return new TreeMap(comparator);
            }
        };
    }

    static final class IconCompatParcelizer<V> implements parseUdtaMeta<List<V>>, Serializable {
        private final int AudioAttributesCompatParcelizer;

        IconCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = FixedSampleSizeRechunker.IconCompatParcelizer(i, "expectedValuesPerKey");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.parseUdtaMeta
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.AudioAttributesCompatParcelizer);
        }
    }

    public static abstract class write<K0> {
        abstract <K extends K0, V> Map<K, Collection<V>> write();

        write() {
        }

        public final RemoteActionCompatParcelizer<K0, Object> RemoteActionCompatParcelizer() {
            return read();
        }

        private RemoteActionCompatParcelizer<K0, Object> read() {
            FixedSampleSizeRechunker.IconCompatParcelizer(2, "expectedValuesPerKey");
            return new RemoteActionCompatParcelizer<K0, Object>(2) { // from class: o.parseSidx.write.1
                private /* synthetic */ int RemoteActionCompatParcelizer = 2;

                @Override // o.parseSidx.RemoteActionCompatParcelizer
                public final <K extends K0, V> parseMoof<K, V> RemoteActionCompatParcelizer() {
                    return parseTfhd.read(write.this.write(), new IconCompatParcelizer(this.RemoteActionCompatParcelizer));
                }
            };
        }
    }

    public static abstract class RemoteActionCompatParcelizer<K0, V0> extends parseSidx<K0, V0> {
        public abstract <K extends K0, V extends V0> parseMoof<K, V> RemoteActionCompatParcelizer();

        RemoteActionCompatParcelizer() {
            super((byte) 0);
        }
    }
}
