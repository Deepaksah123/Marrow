###### Class androidx.graphics.path.PathIteratorPreApi34Impl (androidx.graphics.path.PathIteratorPreApi34Impl)
.class public final Landroidx/graphics/path/PathIteratorPreApi34Impl;
.super Lo/_removeNonVisible;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 \u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0008H\u0082 \u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0008H\u0083 \u00a2\u0006\u0004\u0008\u0011\u0010\u0012J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0004H\u0083 \u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0008H\u0083 \u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0008H\u0083 \u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0008H\u0083 \u00a2\u0006\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b"
    }
    d2 = {
        "Landroidx/graphics/path/PathIteratorPreApi34Impl;",
        "Lo/_removeNonVisible;",
        "Landroid/graphics/Path;",
        "p0",
        "",
        "p1",
        "",
        "p2",
        "",
        "createInternalPathIterator",
        "(Landroid/graphics/Path;IF)J",
        "",
        "destroyInternalPathIterator",
        "(J)V",
        "finalize",
        "()V",
        "",
        "internalPathIteratorHasNext",
        "(J)Z",
        "",
        "internalPathIteratorNext",
        "(J[FI)I",
        "internalPathIteratorPeek",
        "(J)I",
        "internalPathIteratorRawSize",
        "internalPathIteratorSize",
        "AudioAttributesCompatParcelizer",
        "J",
        "RemoteActionCompatParcelizer"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:J


# direct methods
.method private final native createInternalPathIterator(Landroid/graphics/Path;IF)J
.end method

.method private final native destroyInternalPathIterator(J)V
.end method

.method private final native internalPathIteratorHasNext(J)Z
.end method

.method private final native internalPathIteratorNext(J[FI)I
.end method

.method private final native internalPathIteratorPeek(J)I
.end method

.method private final native internalPathIteratorRawSize(J)I
.end method

.method private final native internalPathIteratorSize(J)I
.end method


# virtual methods
.method protected final finalize()V
    .registers 3

    .line 296
    iget-wide v0, p0, Landroidx/graphics/path/PathIteratorPreApi34Impl;->AudioAttributesCompatParcelizer:J

    invoke-direct {p0, v0, v1}, Landroidx/graphics/path/PathIteratorPreApi34Impl;->destroyInternalPathIterator(J)V

    return-void
.end method
