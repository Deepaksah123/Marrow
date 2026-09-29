###### Class com.facebook.shimmer.R (com.facebook.shimmer.R)
.class public final Lcom/facebook/shimmer/R;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/shimmer/R$attr;,
        Lcom/facebook/shimmer/R$id;,
        Lcom/facebook/shimmer/R$styleable;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

###### Class com.facebook.shimmer.R.attr (com.facebook.shimmer.R$attr)
.class public final Lcom/facebook/shimmer/R$attr;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/shimmer/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "attr"
.end annotation


# static fields
.field public static final shimmer_auto_start:I = 0x7f0404f9

.field public static final shimmer_base_alpha:I = 0x7f0404fa

.field public static final shimmer_base_color:I = 0x7f0404fb

.field public static final shimmer_clip_to_children:I = 0x7f0404fc

.field public static final shimmer_colored:I = 0x7f0404fd

.field public static final shimmer_direction:I = 0x7f0404fe

.field public static final shimmer_dropoff:I = 0x7f0404ff

.field public static final shimmer_duration:I = 0x7f040500

.field public static final shimmer_fixed_height:I = 0x7f040501

.field public static final shimmer_fixed_width:I = 0x7f040502

.field public static final shimmer_height_ratio:I = 0x7f040503

.field public static final shimmer_highlight_alpha:I = 0x7f040504

.field public static final shimmer_highlight_color:I = 0x7f040505

.field public static final shimmer_intensity:I = 0x7f040506

.field public static final shimmer_repeat_count:I = 0x7f040507

.field public static final shimmer_repeat_delay:I = 0x7f040508

.field public static final shimmer_repeat_mode:I = 0x7f040509

.field public static final shimmer_shape:I = 0x7f04050a

.field public static final shimmer_tilt:I = 0x7f04050b

.field public static final shimmer_width_ratio:I = 0x7f04050c


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

###### Class com.facebook.shimmer.R.id (com.facebook.shimmer.R$id)
.class public final Lcom/facebook/shimmer/R$id;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/shimmer/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "id"
.end annotation


# static fields
.field public static final bottom_to_top:I = 0x7f0a00b9

.field public static final left_to_right:I = 0x7f0a04b9

.field public static final linear:I = 0x7f0a04ce

.field public static final radial:I = 0x7f0a06e9

.field public static final restart:I = 0x7f0a0720

.field public static final reverse:I = 0x7f0a0722

.field public static final right_to_left:I = 0x7f0a072c

.field public static final top_to_bottom:I = 0x7f0a08a5


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

###### Class com.facebook.shimmer.R.styleable (com.facebook.shimmer.R$styleable)
.class public final Lcom/facebook/shimmer/R$styleable;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/shimmer/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final ShimmerFrameLayout:[I

.field public static final ShimmerFrameLayout_shimmer_auto_start:I = 0x0

.field public static final ShimmerFrameLayout_shimmer_base_alpha:I = 0x1

.field public static final ShimmerFrameLayout_shimmer_base_color:I = 0x2

.field public static final ShimmerFrameLayout_shimmer_clip_to_children:I = 0x3

.field public static final ShimmerFrameLayout_shimmer_colored:I = 0x4

.field public static final ShimmerFrameLayout_shimmer_direction:I = 0x5

.field public static final ShimmerFrameLayout_shimmer_dropoff:I = 0x6

.field public static final ShimmerFrameLayout_shimmer_duration:I = 0x7

.field public static final ShimmerFrameLayout_shimmer_fixed_height:I = 0x8

.field public static final ShimmerFrameLayout_shimmer_fixed_width:I = 0x9

.field public static final ShimmerFrameLayout_shimmer_height_ratio:I = 0xa

.field public static final ShimmerFrameLayout_shimmer_highlight_alpha:I = 0xb

.field public static final ShimmerFrameLayout_shimmer_highlight_color:I = 0xc

.field public static final ShimmerFrameLayout_shimmer_intensity:I = 0xd

.field public static final ShimmerFrameLayout_shimmer_repeat_count:I = 0xe

.field public static final ShimmerFrameLayout_shimmer_repeat_delay:I = 0xf

.field public static final ShimmerFrameLayout_shimmer_repeat_mode:I = 0x10

.field public static final ShimmerFrameLayout_shimmer_shape:I = 0x11

.field public static final ShimmerFrameLayout_shimmer_tilt:I = 0x12

.field public static final ShimmerFrameLayout_shimmer_width_ratio:I = 0x13


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    const/16 v0, 0x14

    .line 1
    new-array v0, v0, [I

    fill-array-data v0, :array_a

    sput-object v0, Lcom/facebook/shimmer/R$styleable;->ShimmerFrameLayout:[I

    return-void

    :array_a
    .array-data 4
        0x7f0404f9
        0x7f0404fa
        0x7f0404fb
        0x7f0404fc
        0x7f0404fd
        0x7f0404fe
        0x7f0404ff
        0x7f040500
        0x7f040501
        0x7f040502
        0x7f040503
        0x7f040504
        0x7f040505
        0x7f040506
        0x7f040507
        0x7f040508
        0x7f040509
        0x7f04050a
        0x7f04050b
        0x7f04050c
    .end array-data
.end method

.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
