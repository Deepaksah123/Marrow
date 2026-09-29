package kotlin;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.ThemeKtWhenMappings;

/* JADX INFO: loaded from: classes4.dex */
abstract class GTAnalyticsV2ResponseModelCompanion<T> {
    abstract void RemoteActionCompatParcelizer(toRSModel torsmodel, T t) throws IOException;

    GTAnalyticsV2ResponseModelCompanion() {
    }

    final GTAnalyticsV2ResponseModelCompanion<Iterable<T>> AudioAttributesCompatParcelizer() {
        return new GTAnalyticsV2ResponseModelCompanion<Iterable<T>>() { // from class: o.GTAnalyticsV2ResponseModelCompanion.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
            public void RemoteActionCompatParcelizer(toRSModel torsmodel, Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    Iterator<T> it = iterable.iterator();
                    while (it.hasNext()) {
                        GTAnalyticsV2ResponseModelCompanion.this.RemoteActionCompatParcelizer(torsmodel, it.next());
                    }
                }
            }
        };
    }

    final GTAnalyticsV2ResponseModelCompanion<Object> RemoteActionCompatParcelizer() {
        return new GTAnalyticsV2ResponseModelCompanion<Object>() { // from class: o.GTAnalyticsV2ResponseModelCompanion.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
            final void RemoteActionCompatParcelizer(toRSModel torsmodel, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        GTAnalyticsV2ResponseModelCompanion.this.RemoteActionCompatParcelizer(torsmodel, Array.get(obj, i));
                    }
                }
            }
        };
    }

    static final class MediaMetadataCompat extends GTAnalyticsV2ResponseModelCompanion<Object> {
        private final int AudioAttributesCompatParcelizer;
        private final Method write;

        MediaMetadataCompat(Method method, int i) {
            this.write = method;
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final void RemoteActionCompatParcelizer(toRSModel torsmodel, Object obj) {
            if (obj == null) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.write, this.AudioAttributesCompatParcelizer, "@Url parameter is null.", new Object[0]);
            }
            torsmodel.read(obj);
        }
    }

    static final class read<T> extends GTAnalyticsV2ResponseModelCompanion<T> {
        private final PlanSubscriptionRSModel<T, String> IconCompatParcelizer;
        private final String read;

        read(String str, PlanSubscriptionRSModel<T, String> planSubscriptionRSModel) {
            this.read = (String) Objects.requireNonNull(str, "name == null");
            this.IconCompatParcelizer = planSubscriptionRSModel;
        }

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final void RemoteActionCompatParcelizer(toRSModel torsmodel, T t) throws IOException {
            String strIconCompatParcelizer;
            if (t == null || (strIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(t)) == null) {
                return;
            }
            torsmodel.IconCompatParcelizer(this.read, strIconCompatParcelizer);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer<T> extends GTAnalyticsV2ResponseModelCompanion<T> {
        private final int AudioAttributesCompatParcelizer;
        private final Method IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final PlanSubscriptionRSModel<T, String> read;
        private final String write;

        AudioAttributesImplApi26Parcelizer(Method method, int i, String str, PlanSubscriptionRSModel<T, String> planSubscriptionRSModel, boolean z) {
            this.IconCompatParcelizer = method;
            this.AudioAttributesCompatParcelizer = i;
            this.write = (String) Objects.requireNonNull(str, "name == null");
            this.read = planSubscriptionRSModel;
            this.RemoteActionCompatParcelizer = z;
        }

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final void RemoteActionCompatParcelizer(toRSModel torsmodel, T t) throws IOException {
            if (t == null) {
                Method method = this.IconCompatParcelizer;
                int i = this.AudioAttributesCompatParcelizer;
                StringBuilder sb = new StringBuilder("Path parameter \"");
                sb.append(this.write);
                sb.append("\" value must not be null.");
                throw GTSubjectAnalyticsV2ResponseModel.write(method, i, sb.toString(), new Object[0]);
            }
            torsmodel.write(this.write, this.read.IconCompatParcelizer(t), this.RemoteActionCompatParcelizer);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver<T> extends GTAnalyticsV2ResponseModelCompanion<T> {
        private final String IconCompatParcelizer;
        private final PlanSubscriptionRSModel<T, String> RemoteActionCompatParcelizer;
        private final boolean write;

        MediaBrowserCompatCustomActionResultReceiver(String str, PlanSubscriptionRSModel<T, String> planSubscriptionRSModel, boolean z) {
            this.IconCompatParcelizer = (String) Objects.requireNonNull(str, "name == null");
            this.RemoteActionCompatParcelizer = planSubscriptionRSModel;
            this.write = z;
        }

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final void RemoteActionCompatParcelizer(toRSModel torsmodel, T t) throws IOException {
            String strIconCompatParcelizer;
            if (t == null || (strIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(t)) == null) {
                return;
            }
            torsmodel.read(this.IconCompatParcelizer, strIconCompatParcelizer, this.write);
        }
    }

    static final class MediaBrowserCompatMediaItem<T> extends GTAnalyticsV2ResponseModelCompanion<T> {
        private final boolean RemoteActionCompatParcelizer;
        private final PlanSubscriptionRSModel<T, String> read;

        MediaBrowserCompatMediaItem(PlanSubscriptionRSModel<T, String> planSubscriptionRSModel, boolean z) {
            this.read = planSubscriptionRSModel;
            this.RemoteActionCompatParcelizer = z;
        }

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final void RemoteActionCompatParcelizer(toRSModel torsmodel, T t) throws IOException {
            if (t == null) {
                return;
            }
            torsmodel.read(this.read.IconCompatParcelizer(t), null, this.RemoteActionCompatParcelizer);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver<T> extends GTAnalyticsV2ResponseModelCompanion<Map<String, T>> {
        private final int AudioAttributesCompatParcelizer;
        private final Method IconCompatParcelizer;
        private final PlanSubscriptionRSModel<T, String> RemoteActionCompatParcelizer;
        private final boolean write;

        MediaBrowserCompatSearchResultReceiver(Method method, int i, PlanSubscriptionRSModel<T, String> planSubscriptionRSModel, boolean z) {
            this.IconCompatParcelizer = method;
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = planSubscriptionRSModel;
            this.write = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        public void RemoteActionCompatParcelizer(toRSModel torsmodel, Map<String, T> map) throws IOException {
            if (map == null) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    Method method = this.IconCompatParcelizer;
                    int i = this.AudioAttributesCompatParcelizer;
                    StringBuilder sb = new StringBuilder("Query map contained null value for key '");
                    sb.append(key);
                    sb.append("'.");
                    throw GTSubjectAnalyticsV2ResponseModel.write(method, i, sb.toString(), new Object[0]);
                }
                String strIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(value);
                if (strIconCompatParcelizer == null) {
                    Method method2 = this.IconCompatParcelizer;
                    int i2 = this.AudioAttributesCompatParcelizer;
                    StringBuilder sb2 = new StringBuilder("Query map value '");
                    sb2.append(value);
                    sb2.append("' converted to null by ");
                    sb2.append(this.RemoteActionCompatParcelizer.getClass().getName());
                    sb2.append(" for key '");
                    sb2.append(key);
                    sb2.append("'.");
                    throw GTSubjectAnalyticsV2ResponseModel.write(method2, i2, sb2.toString(), new Object[0]);
                }
                torsmodel.read(key, strIconCompatParcelizer, this.write);
            }
        }
    }

    static final class write<T> extends GTAnalyticsV2ResponseModelCompanion<Map<String, T>> {
        private final PlanSubscriptionRSModel<T, String> IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final Method write;

        write(Method method, int i, PlanSubscriptionRSModel<T, String> planSubscriptionRSModel) {
            this.write = method;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = planSubscriptionRSModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(toRSModel torsmodel, Map<String, T> map) throws IOException {
            if (map == null) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.write, this.RemoteActionCompatParcelizer, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.write, this.RemoteActionCompatParcelizer, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    Method method = this.write;
                    int i = this.RemoteActionCompatParcelizer;
                    StringBuilder sb = new StringBuilder("Header map contained null value for key '");
                    sb.append(key);
                    sb.append("'.");
                    throw GTSubjectAnalyticsV2ResponseModel.write(method, i, sb.toString(), new Object[0]);
                }
                torsmodel.IconCompatParcelizer(key, this.IconCompatParcelizer.IconCompatParcelizer(value));
            }
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends GTAnalyticsV2ResponseModelCompanion<ShapeKt> {
        private final int RemoteActionCompatParcelizer;
        private final Method write;

        AudioAttributesImplApi21Parcelizer(Method method, int i) {
            this.write = method;
            this.RemoteActionCompatParcelizer = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(toRSModel torsmodel, ShapeKt shapeKt) {
            if (shapeKt == null) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.write, this.RemoteActionCompatParcelizer, "Headers parameter must not be null.", new Object[0]);
            }
            torsmodel.AudioAttributesCompatParcelizer(shapeKt);
        }
    }

    static final class IconCompatParcelizer<T> extends GTAnalyticsV2ResponseModelCompanion<T> {
        private final String RemoteActionCompatParcelizer;
        private final boolean read;
        private final PlanSubscriptionRSModel<T, String> write;

        IconCompatParcelizer(String str, PlanSubscriptionRSModel<T, String> planSubscriptionRSModel, boolean z) {
            this.RemoteActionCompatParcelizer = (String) Objects.requireNonNull(str, "name == null");
            this.write = planSubscriptionRSModel;
            this.read = z;
        }

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final void RemoteActionCompatParcelizer(toRSModel torsmodel, T t) throws IOException {
            String strIconCompatParcelizer;
            if (t == null || (strIconCompatParcelizer = this.write.IconCompatParcelizer(t)) == null) {
                return;
            }
            torsmodel.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, strIconCompatParcelizer, this.read);
        }
    }

    static final class RemoteActionCompatParcelizer<T> extends GTAnalyticsV2ResponseModelCompanion<Map<String, T>> {
        private final int AudioAttributesCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final Method read;
        private final PlanSubscriptionRSModel<T, String> write;

        RemoteActionCompatParcelizer(Method method, int i, PlanSubscriptionRSModel<T, String> planSubscriptionRSModel, boolean z) {
            this.read = method;
            this.AudioAttributesCompatParcelizer = i;
            this.write = planSubscriptionRSModel;
            this.RemoteActionCompatParcelizer = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(toRSModel torsmodel, Map<String, T> map) throws IOException {
            if (map == null) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.read, this.AudioAttributesCompatParcelizer, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.read, this.AudioAttributesCompatParcelizer, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    Method method = this.read;
                    int i = this.AudioAttributesCompatParcelizer;
                    StringBuilder sb = new StringBuilder("Field map contained null value for key '");
                    sb.append(key);
                    sb.append("'.");
                    throw GTSubjectAnalyticsV2ResponseModel.write(method, i, sb.toString(), new Object[0]);
                }
                String strIconCompatParcelizer = this.write.IconCompatParcelizer(value);
                if (strIconCompatParcelizer == null) {
                    Method method2 = this.read;
                    int i2 = this.AudioAttributesCompatParcelizer;
                    StringBuilder sb2 = new StringBuilder("Field map value '");
                    sb2.append(value);
                    sb2.append("' converted to null by ");
                    sb2.append(this.write.getClass().getName());
                    sb2.append(" for key '");
                    sb2.append(key);
                    sb2.append("'.");
                    throw GTSubjectAnalyticsV2ResponseModel.write(method2, i2, sb2.toString(), new Object[0]);
                }
                torsmodel.AudioAttributesCompatParcelizer(key, strIconCompatParcelizer, this.RemoteActionCompatParcelizer);
            }
        }
    }

    static final class AudioAttributesImplBaseParcelizer<T> extends GTAnalyticsV2ResponseModelCompanion<T> {
        private final Method IconCompatParcelizer;
        private final ShapeKt RemoteActionCompatParcelizer;
        private final PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> read;
        private final int write;

        AudioAttributesImplBaseParcelizer(Method method, int i, ShapeKt shapeKt, PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> planSubscriptionRSModel) {
            this.IconCompatParcelizer = method;
            this.write = i;
            this.RemoteActionCompatParcelizer = shapeKt;
            this.read = planSubscriptionRSModel;
        }

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final void RemoteActionCompatParcelizer(toRSModel torsmodel, T t) {
            if (t == null) {
                return;
            }
            try {
                torsmodel.read(this.RemoteActionCompatParcelizer, this.read.IconCompatParcelizer(t));
            } catch (IOException e) {
                Method method = this.IconCompatParcelizer;
                int i = this.write;
                StringBuilder sb = new StringBuilder("Unable to convert ");
                sb.append(t);
                sb.append(" to RequestBody");
                throw GTSubjectAnalyticsV2ResponseModel.write(method, i, sb.toString(), e);
            }
        }
    }

    static final class MediaDescriptionCompat extends GTAnalyticsV2ResponseModelCompanion<ThemeKtWhenMappings.AudioAttributesCompatParcelizer> {
        static final MediaDescriptionCompat AudioAttributesCompatParcelizer = new MediaDescriptionCompat();

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final /* synthetic */ void RemoteActionCompatParcelizer(toRSModel torsmodel, ThemeKtWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
            AudioAttributesCompatParcelizer(torsmodel, audioAttributesCompatParcelizer);
        }

        private MediaDescriptionCompat() {
        }

        private static void AudioAttributesCompatParcelizer(toRSModel torsmodel, ThemeKtWhenMappings.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            if (audioAttributesCompatParcelizer != null) {
                torsmodel.read(audioAttributesCompatParcelizer);
            }
        }
    }

    static final class MediaBrowserCompatItemReceiver<T> extends GTAnalyticsV2ResponseModelCompanion<Map<String, T>> {
        private final String AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final Method read;
        private final PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> write;

        MediaBrowserCompatItemReceiver(Method method, int i, PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> planSubscriptionRSModel, String str) {
            this.read = method;
            this.IconCompatParcelizer = i;
            this.write = planSubscriptionRSModel;
            this.AudioAttributesCompatParcelizer = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void RemoteActionCompatParcelizer(toRSModel torsmodel, Map<String, T> map) throws IOException {
            if (map == null) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.read, this.IconCompatParcelizer, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw GTSubjectAnalyticsV2ResponseModel.write(this.read, this.IconCompatParcelizer, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    Method method = this.read;
                    int i = this.IconCompatParcelizer;
                    StringBuilder sb = new StringBuilder("Part map contained null value for key '");
                    sb.append(key);
                    sb.append("'.");
                    throw GTSubjectAnalyticsV2ResponseModel.write(method, i, sb.toString(), new Object[0]);
                }
                StringBuilder sb2 = new StringBuilder("form-data; name=\"");
                sb2.append(key);
                sb2.append("\"");
                torsmodel.read(ShapeKt.IconCompatParcelizer("Content-Disposition", sb2.toString(), "Content-Transfer-Encoding", this.AudioAttributesCompatParcelizer), this.write.IconCompatParcelizer(value));
            }
        }
    }

    static final class AudioAttributesCompatParcelizer<T> extends GTAnalyticsV2ResponseModelCompanion<T> {
        private final PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> AudioAttributesCompatParcelizer;
        private final Method IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer(Method method, int i, PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> planSubscriptionRSModel) {
            this.IconCompatParcelizer = method;
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = planSubscriptionRSModel;
        }

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final void RemoteActionCompatParcelizer(toRSModel torsmodel, T t) {
            if (t == null) {
                throw GTSubjectAnalyticsV2ResponseModel.write(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                torsmodel.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(t));
            } catch (IOException e) {
                Method method = this.IconCompatParcelizer;
                int i = this.RemoteActionCompatParcelizer;
                StringBuilder sb = new StringBuilder("Unable to convert ");
                sb.append(t);
                sb.append(" to RequestBody");
                throw GTSubjectAnalyticsV2ResponseModel.write(method, e, i, sb.toString(), new Object[0]);
            }
        }
    }

    static final class RatingCompat<T> extends GTAnalyticsV2ResponseModelCompanion<T> {
        final Class<T> read;

        RatingCompat(Class<T> cls) {
            this.read = cls;
        }

        @Override // kotlin.GTAnalyticsV2ResponseModelCompanion
        final void RemoteActionCompatParcelizer(toRSModel torsmodel, T t) {
            torsmodel.IconCompatParcelizer(this.read, t);
        }
    }
}
