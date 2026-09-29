package kotlin;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import kotlin.SearchMcqResponseBody;

/* JADX INFO: loaded from: classes4.dex */
final class NotesSubscriptionRSModelKt extends SearchMcqResponseBody.write {
    static final SearchMcqResponseBody.write AudioAttributesCompatParcelizer = new NotesSubscriptionRSModelKt();

    NotesSubscriptionRSModelKt() {
    }

    @Override // o.SearchMcqResponseBody.write
    public final SearchMcqResponseBody<?, ?> read(Type type, Annotation[] annotationArr) {
        if (IconCompatParcelizer(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type type2 = read((ParameterizedType) type);
        if (IconCompatParcelizer(type2) != getTopicStat.class) {
            return new IconCompatParcelizer(type2);
        }
        if (!(type2 instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new read(read((ParameterizedType) type2));
    }

    static final class IconCompatParcelizer<R> implements SearchMcqResponseBody<R, CompletableFuture<R>> {
        private final Type read;

        IconCompatParcelizer(Type type) {
            this.read = type;
        }

        @Override // kotlin.SearchMcqResponseBody
        public final Type read() {
            return this.read;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.SearchMcqResponseBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> AudioAttributesCompatParcelizer(SearchTextResponseBody<R> searchTextResponseBody) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(searchTextResponseBody);
            searchTextResponseBody.IconCompatParcelizer(new C0038IconCompatParcelizer(audioAttributesCompatParcelizer));
            return audioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: o.NotesSubscriptionRSModelKt$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        class C0038IconCompatParcelizer implements SubjectLSModel<R> {
            private final CompletableFuture<R> read;

            public C0038IconCompatParcelizer(CompletableFuture<R> completableFuture) {
                this.read = completableFuture;
            }

            @Override // kotlin.SubjectLSModel
            public final void read(SearchTextResponseBody<R> searchTextResponseBody, getTopicStat<R> gettopicstat) {
                if (gettopicstat.read()) {
                    this.read.complete(gettopicstat.AudioAttributesCompatParcelizer());
                } else {
                    this.read.completeExceptionally(new SubscriptionRSModelKt(gettopicstat));
                }
            }

            @Override // kotlin.SubjectLSModel
            public final void AudioAttributesCompatParcelizer(SearchTextResponseBody<R> searchTextResponseBody, Throwable th) {
                this.read.completeExceptionally(th);
            }
        }
    }

    static final class read<R> implements SearchMcqResponseBody<R, CompletableFuture<getTopicStat<R>>> {
        private final Type AudioAttributesCompatParcelizer;

        read(Type type) {
            this.AudioAttributesCompatParcelizer = type;
        }

        @Override // kotlin.SearchMcqResponseBody
        public final Type read() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.SearchMcqResponseBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<getTopicStat<R>> AudioAttributesCompatParcelizer(SearchTextResponseBody<R> searchTextResponseBody) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(searchTextResponseBody);
            searchTextResponseBody.IconCompatParcelizer(new write(audioAttributesCompatParcelizer));
            return audioAttributesCompatParcelizer;
        }

        class write implements SubjectLSModel<R> {
            private final CompletableFuture<getTopicStat<R>> write;

            public write(CompletableFuture<getTopicStat<R>> completableFuture) {
                this.write = completableFuture;
            }

            @Override // kotlin.SubjectLSModel
            public final void read(SearchTextResponseBody<R> searchTextResponseBody, getTopicStat<R> gettopicstat) {
                this.write.complete(gettopicstat);
            }

            @Override // kotlin.SubjectLSModel
            public final void AudioAttributesCompatParcelizer(SearchTextResponseBody<R> searchTextResponseBody, Throwable th) {
                this.write.completeExceptionally(th);
            }
        }
    }

    static final class AudioAttributesCompatParcelizer<T> extends CompletableFuture<T> {
        private final SearchTextResponseBody<?> IconCompatParcelizer;

        AudioAttributesCompatParcelizer(SearchTextResponseBody<?> searchTextResponseBody) {
            this.IconCompatParcelizer = searchTextResponseBody;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
            return super.cancel(z);
        }
    }
}
