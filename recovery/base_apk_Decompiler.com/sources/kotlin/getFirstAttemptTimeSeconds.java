package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.SearchMcqResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class getFirstAttemptTimeSeconds extends SearchMcqResponseBody.write {
    private final getIds RemoteActionCompatParcelizer = null;
    private final boolean AudioAttributesCompatParcelizer = false;

    public static getFirstAttemptTimeSeconds RemoteActionCompatParcelizer() {
        return new getFirstAttemptTimeSeconds();
    }

    private getFirstAttemptTimeSeconds() {
    }

    @Override // o.SearchMcqResponseBody.write
    public final SearchMcqResponseBody<?, ?> read(Type type, Annotation[] annotationArr) {
        Type type2;
        boolean z;
        boolean z2;
        String str;
        Class<?> clsIconCompatParcelizer = IconCompatParcelizer(type);
        if (clsIconCompatParcelizer == getAllOptions.class) {
            return new getGuessed(Void.class, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, false, true, false, false, false, true);
        }
        boolean z3 = clsIconCompatParcelizer == accessgetEmptyStatecp.class;
        boolean z4 = clsIconCompatParcelizer == LessonDynamicResponseBody.class;
        boolean z5 = clsIconCompatParcelizer == getEmptyState.class;
        if (clsIconCompatParcelizer != LessonIndexResponseBody.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z3) {
                str = "Flowable";
            } else if (z4) {
                str = "Single";
            } else {
                str = z5 ? "Maybe" : "Observable";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" return type must be parameterized as ");
            sb.append(str);
            sb.append("<Foo> or ");
            sb.append(str);
            sb.append("<? extends Foo>");
            throw new IllegalStateException(sb.toString());
        }
        Type type3 = read((ParameterizedType) type);
        Class<?> clsIconCompatParcelizer2 = IconCompatParcelizer(type3);
        if (clsIconCompatParcelizer2 == getTopicStat.class) {
            if (!(type3 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            type2 = read((ParameterizedType) type3);
            z2 = false;
            z = false;
        } else if (clsIconCompatParcelizer2 != getForceSubmit.class) {
            type2 = type3;
            z = true;
            z2 = false;
        } else {
            if (!(type3 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            type2 = read((ParameterizedType) type3);
            z2 = true;
            z = false;
        }
        return new getGuessed(type2, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, z2, z, z3, z4, z5, false);
    }
}
