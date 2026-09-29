package kotlin;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getActiveEdition {

    public static abstract class AudioAttributesCompatParcelizer<N, R> implements RemoteActionCompatParcelizer<N, R> {
        @Override // o.getActiveEdition.RemoteActionCompatParcelizer
        public boolean IconCompatParcelizer(N n) {
            return true;
        }

        @Override // o.getActiveEdition.RemoteActionCompatParcelizer
        public void RemoteActionCompatParcelizer(N n) {
        }
    }

    public interface IconCompatParcelizer<N> {
        boolean read(N n);
    }

    public interface RemoteActionCompatParcelizer<N, R> {
        boolean IconCompatParcelizer(N n);

        void RemoteActionCompatParcelizer(N n);

        R write();
    }

    public interface write<N> {
        Iterable<? extends N> RemoteActionCompatParcelizer(N n);
    }

    private static <N, R> R read(Collection<N> collection, write<N> writeVar, IconCompatParcelizer<N> iconCompatParcelizer, RemoteActionCompatParcelizer<N, R> remoteActionCompatParcelizer) {
        if (collection == null) {
            read(0);
        }
        if (writeVar == null) {
            read(1);
        }
        if (remoteActionCompatParcelizer == null) {
            read(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            read(it.next(), writeVar, iconCompatParcelizer, remoteActionCompatParcelizer);
        }
        return remoteActionCompatParcelizer.write();
    }

    public static <N, R> R RemoteActionCompatParcelizer(Collection<N> collection, write<N> writeVar, RemoteActionCompatParcelizer<N, R> remoteActionCompatParcelizer) {
        if (collection == null) {
            read(4);
        }
        if (writeVar == null) {
            read(5);
        }
        return (R) read((Collection) collection, (write) writeVar, (IconCompatParcelizer) new read(), (RemoteActionCompatParcelizer) remoteActionCompatParcelizer);
    }

    public static <N> Boolean AudioAttributesCompatParcelizer(Collection<N> collection, write<N> writeVar, final getAnswerMap<N, Boolean> getanswermap) {
        if (collection == null) {
            read(7);
        }
        if (writeVar == null) {
            read(8);
        }
        if (getanswermap == null) {
            read(9);
        }
        final boolean[] zArr = new boolean[1];
        return (Boolean) RemoteActionCompatParcelizer(collection, writeVar, new AudioAttributesCompatParcelizer<N, Boolean>() { // from class: o.getActiveEdition.2
            @Override // o.getActiveEdition.AudioAttributesCompatParcelizer, o.getActiveEdition.RemoteActionCompatParcelizer
            public final boolean IconCompatParcelizer(N n) {
                if (((Boolean) getanswermap.invoke(n)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // o.getActiveEdition.RemoteActionCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Boolean write() {
                return Boolean.valueOf(zArr[0]);
            }
        });
    }

    private static <N> void read(N n, write<N> writeVar, IconCompatParcelizer<N> iconCompatParcelizer, RemoteActionCompatParcelizer<N, ?> remoteActionCompatParcelizer) {
        if (n == null) {
            read(22);
        }
        if (writeVar == null) {
            read(23);
        }
        if (iconCompatParcelizer == null) {
            read(24);
        }
        if (remoteActionCompatParcelizer == null) {
            read(25);
        }
        if (iconCompatParcelizer.read(n) && remoteActionCompatParcelizer.IconCompatParcelizer(n)) {
            Iterator<? extends N> it = writeVar.RemoteActionCompatParcelizer(n).iterator();
            while (it.hasNext()) {
                read(it.next(), writeVar, iconCompatParcelizer, remoteActionCompatParcelizer);
            }
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(n);
        }
    }

    private static /* synthetic */ void read(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static class read<N> implements IconCompatParcelizer<N> {
        private final Set<N> AudioAttributesCompatParcelizer;

        public read() {
            this(new HashSet());
        }

        private read(Set<N> set) {
            this.AudioAttributesCompatParcelizer = set;
        }

        @Override // o.getActiveEdition.IconCompatParcelizer
        public final boolean read(N n) {
            return this.AudioAttributesCompatParcelizer.add(n);
        }
    }
}
