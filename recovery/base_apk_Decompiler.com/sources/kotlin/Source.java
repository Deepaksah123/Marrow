package kotlin;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.SearchMcqResponseBody;

/* JADX INFO: loaded from: classes4.dex */
final class Source extends SearchMcqResponseBody.write {
    private final Executor IconCompatParcelizer;

    Source(Executor executor) {
        this.IconCompatParcelizer = executor;
    }

    @Override // o.SearchMcqResponseBody.write
    public final SearchMcqResponseBody<?, ?> read(Type type, Annotation[] annotationArr) {
        if (IconCompatParcelizer(type) != SearchTextResponseBody.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final Type typeRemoteActionCompatParcelizer = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, (ParameterizedType) type);
        final Executor executor = GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(annotationArr, (Class<? extends Annotation>) GTSubjectAnalyticsV2RSModel.class) ? null : this.IconCompatParcelizer;
        return new SearchMcqResponseBody<Object, SearchTextResponseBody<?>>() { // from class: o.Source.4
            @Override // kotlin.SearchMcqResponseBody
            public final Type read() {
                return typeRemoteActionCompatParcelizer;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.SearchMcqResponseBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public SearchTextResponseBody<Object> AudioAttributesCompatParcelizer(SearchTextResponseBody<Object> searchTextResponseBody) {
                Executor executor2 = executor;
                return executor2 == null ? searchTextResponseBody : new RemoteActionCompatParcelizer(executor2, searchTextResponseBody);
            }
        };
    }

    static final class RemoteActionCompatParcelizer<T> implements SearchTextResponseBody<T> {
        final Executor RemoteActionCompatParcelizer;
        final SearchTextResponseBody<T> read;

        RemoteActionCompatParcelizer(Executor executor, SearchTextResponseBody<T> searchTextResponseBody) {
            this.RemoteActionCompatParcelizer = executor;
            this.read = searchTextResponseBody;
        }

        @Override // kotlin.SearchTextResponseBody
        public final void IconCompatParcelizer(SubjectLSModel<T> subjectLSModel) {
            Objects.requireNonNull(subjectLSModel, "callback == null");
            this.read.IconCompatParcelizer(new AnonymousClass1(subjectLSModel));
        }

        /* JADX INFO: renamed from: o.Source$RemoteActionCompatParcelizer$1, reason: invalid class name */
        final class AnonymousClass1 implements SubjectLSModel<T> {
            private /* synthetic */ SubjectLSModel read;

            AnonymousClass1(SubjectLSModel subjectLSModel) {
                this.read = subjectLSModel;
            }

            @Override // kotlin.SubjectLSModel
            public final void read(SearchTextResponseBody<T> searchTextResponseBody, final getTopicStat<T> gettopicstat) {
                Executor executor = RemoteActionCompatParcelizer.this.RemoteActionCompatParcelizer;
                final SubjectLSModel subjectLSModel = this.read;
                executor.execute(new Runnable() { // from class: o.PlanDetailRSModel
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(subjectLSModel, gettopicstat);
                    }
                });
            }

            final /* synthetic */ void RemoteActionCompatParcelizer(SubjectLSModel subjectLSModel, getTopicStat gettopicstat) {
                if (RemoteActionCompatParcelizer.this.read.IconCompatParcelizer()) {
                    subjectLSModel.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer.this, new IOException("Canceled"));
                } else {
                    subjectLSModel.read(RemoteActionCompatParcelizer.this, gettopicstat);
                }
            }

            @Override // kotlin.SubjectLSModel
            public final void AudioAttributesCompatParcelizer(SearchTextResponseBody<T> searchTextResponseBody, final Throwable th) {
                Executor executor = RemoteActionCompatParcelizer.this.RemoteActionCompatParcelizer;
                final SubjectLSModel subjectLSModel = this.read;
                executor.execute(new Runnable() { // from class: o.SubscriptionDetailRSModel
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(subjectLSModel, th);
                    }
                });
            }

            final /* synthetic */ void RemoteActionCompatParcelizer(SubjectLSModel subjectLSModel, Throwable th) {
                subjectLSModel.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer.this, th);
            }
        }

        @Override // kotlin.SearchTextResponseBody
        public final getTopicStat<T> read() throws IOException {
            return this.read.read();
        }

        @Override // kotlin.SearchTextResponseBody
        public final void RemoteActionCompatParcelizer() {
            this.read.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.SearchTextResponseBody
        public final boolean IconCompatParcelizer() {
            return this.read.IconCompatParcelizer();
        }

        @Override // kotlin.SearchTextResponseBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final SearchTextResponseBody<T> clone() {
            return new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.read.clone());
        }

        @Override // kotlin.SearchTextResponseBody
        public final ThemeKtExternalSyntheticLambda0 AudioAttributesCompatParcelizer() {
            return this.read.AudioAttributesCompatParcelizer();
        }
    }
}
