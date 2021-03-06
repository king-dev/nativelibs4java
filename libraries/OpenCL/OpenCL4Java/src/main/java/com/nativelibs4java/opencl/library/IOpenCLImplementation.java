package com.nativelibs4java.opencl.library;

import org.bridj.Pointer;
import org.bridj.SizeT;
import org.bridj.TypedPointer;
import org.bridj.ann.Optional;
import org.bridj.ann.Ptr;

public interface IOpenCLImplementation {

    
    public static final int CL_DEVICE_TYPE_CPU = (1 << 1);
    public static final int CL_SCHAR_MAX = 127;
    public static final int CL_FP_INF_NAN = (1 << 1);
    public static final int CL_GLX_DISPLAY_KHR = 8202;
    public static final int CL_GLOBAL = 2;
    public static final int CL_DEVICE_GLOBAL_MEM_SIZE = 4127;
    public static final int CL_KERNEL_LOCAL_MEM_SIZE = 4530;
    public static final int CL_MEM_READ_ONLY = (1 << 2);
    public static final int CL_IMAGE_NUM_MIP_LEVELS = 4377;
    public static final int CL_MEM_OBJECT_IMAGE1D_BUFFER = 4342;
    public static final int CL_PROGRAM_REFERENCE_COUNT = 4448;
    public static final int CL_GL_OBJECT_TEXTURE2D_ARRAY = 8206;
    public static final double CL_M_PI_2 = 1.570796326794896557999;
    public static final float CL_M_LOG2E_F = 1.44269502162933f;
    public static final double CL_M_PI_4 = 0.785398163397448278999;
    public static final int CL_FLT_MIN_EXP = -125;
    public static final int CL_DEVICE_VENDOR_ID = 4097;
    public static final int CL_FLOAT = 4318;
    public static final int CL_NONE = 0;
    public static final int CL_PROGRAM_BINARY_TYPE_COMPILED_OBJECT = 1;
    public static final int CL_BGRA = 4278;
    public static final int CL_DEVICE_NATIVE_VECTOR_WIDTH_CHAR = 4150;
    public static final int CL_COMPILE_PROGRAM_FAILURE = -15;
    public static final int CL_UNSIGNED_INT32 = 4316;
    public static final int CL_DEVICE_MAX_COMPUTE_UNITS = 4098;
    public static final int CL_RGBx = 4284;
    public static final int CL_CHAR_MIN = (-127 - 1);
    public static final int CL_DEVICE_REGISTERS_PER_BLOCK_NV = 16386;
    public static final int CL_PLATFORM_EXTENSIONS = 2308;
    public static final int CL_MEM_HOST_READ_ONLY = (1 << 8);
    public static final int CL_DEVICE_TYPE_GPU = (1 << 2);
    public static final int CL_PROGRAM_NUM_KERNELS = 4455;
    public static final float CL_M_PI_F = 3.14159274101257f;
    public static final int CL_LINKER_NOT_AVAILABLE = -16;
    public static final int CL_READ_ONLY_CACHE = 1;
    public static final int CL_IMAGE_FORMAT_MISMATCH = -9;
    public static final int CL_OUT_OF_RESOURCES = -5;
    public static final int CL_INVALID_IMAGE_SIZE = -40;
    public static final int CL_INVALID_EVENT_WAIT_LIST = -57;
    public static final int CL_DEVICE_PARTITION_FAILED = -18;
    public static final int CL_IMAGE_BUFFER = 4376;
    public static final int cl_APPLE_SetMemObjectDestructor = 1;
    public static final int CL_UNSIGNED_INT16 = 4315;
    public static final int CL_DEVICE_PRINTF_BUFFER_SIZE = 4169;
    public static final int CL_COMMAND_NDRANGE_KERNEL = 4592;
    public static final int CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT = 4106;
    public static final int CL_COMMAND_FILL_IMAGE = 4616;
    public static final int CL_DEVICE_MAX_CONSTANT_ARGS = 4129;
    public static final int CL_PROGRAM_BINARY_TYPE_NONE = 0;
    public static final int CL_CHAR_BIT = 8;
    public static final int CL_DEVICE_TYPE_ALL = -1;
    public static final int CL_QUEUED = 3;
    public static final double CL_M_LN10 = 2.302585092994045901094;
    public static final int CL_INVALID_MIP_LEVEL = -62;
    public static final int CL_ADDRESS_NONE = 4400;
    public static final int CL_RGBA = 4277;
    public static final int CL_CONTEXT_DEVICES = 4225;
    public static final int CL_DEVICE_PARTITION_MAX_SUB_DEVICES = 4163;
    public static final int CL_INVALID_PARTITION_NAME_EXT = -1059;
    public static final int CL_KERNEL_ARG_ACCESS_READ_ONLY = 4512;
    public static final int CL_INVALID_WORK_ITEM_SIZE = -55;
    public static final int CL_DEVICE_KERNEL_EXEC_TIMEOUT_NV = 16389;
    public static final int CL_INVALID_WORK_GROUP_SIZE = -54;
    public static final int CL_DEVICE_ERROR_CORRECTION_SUPPORT = 4132;
    public static final int CL_DBL_RADIX = 2;
    public static final int CL_DEVICE_PARTITION_BY_COUNTS = 4231;
    public static final int CL_NON_BLOCKING = 0;
    public static final int CL_DEVICE_LOCAL_MEM_SIZE = 4131;
    public static final int CL_COMMAND_RELEASE_GL_OBJECTS = 4608;
    public static final int CL_ADDRESS_MIRRORED_REPEAT = 4404;
    public static final int CL_INVALID_KERNEL_ARGS = -52;
    public static final int CL_INVALID_GL_CONTEXT_APPLE = -1000;
    public static final int CL_CONTEXT_PLATFORM = 4228;
    public static final int CL_HAS_HI_LO_VECTOR_FIELDS = 1;
    public static final int CL_KERNEL_ARG_TYPE_RESTRICT = (1 << 1);
    public static final int CL_MEM_MAP_COUNT = 4356;
    public static final int CL_AFFINITY_DOMAIN_NEXT_FISSIONABLE_EXT = 256;
    public static final int CL_PROFILING_COMMAND_SUBMIT = 4737;
    public static final int CL_DBL_MIN_EXP = -1021;
    public static final double CL_M_SQRT2 = 1.414213562373095145475;
    public static final int CL_COMMAND_ACQUIRE_GL_OBJECTS = 4607;
    public static final long CL_UINT_MAX = 4294967295L;
    public static final float CL_M_SQRT1_2_F = 0.70710676908493f;
    public static final double CL_M_2_SQRTPI = 1.128379167095512558561;
    public static final int CL_KERNEL_ARG_INFO_NOT_AVAILABLE = -19;
    public static final int CL_COMMAND_NATIVE_KERNEL = 4594;
    public static final int CL_IMAGE_WIDTH = 4372;
    public static final int CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG = 4105;
    public static final int CL_INVALID_DEVICE_TYPE = -31;
    public static final int CL_COMMAND_COPY_IMAGE_TO_BUFFER = 4601;
    public static final int CL_GL_TEXTURE_TARGET = 8196;
    public static final int CL_QUEUE_PROPERTIES = 4243;
    public static final float CL_M_2_PI_F = 0.63661974668503f;
    public static final int CL_COMMAND_WRITE_BUFFER_RECT = 4610;
    public static final int CL_MEM_ASSOCIATED_MEMOBJECT = 4359;
    public static final int CL_INVALID_ARG_VALUE = -50;
    public static final int CL_CONTEXT_REFERENCE_COUNT = 4224;
    public static final int CL_DEVICE_TYPE = 4096;
    public static final int CL_QUEUE_CONTEXT = 4240;
    public static final int CL_DEVICE_SINGLE_FP_CONFIG = 4123;
    public static final int CL_SNORM_INT16 = 4305;
    public static final int CL_ARGB = 4279;
    public static final int CL_DEVICE_COMPUTE_CAPABILITY_MINOR_NV = 16385;
    public static final int CL_KERNEL_ARG_NAME = 4506;
    public static final int CL_EVENT_COMMAND_QUEUE = 4560;
    public static final int CL_SUCCESS = 0;
    public static final int CL_PROFILING_INFO_NOT_AVAILABLE = -7;
    public static final int CL_INVALID_BUFFER_SIZE = -61;
    public static final int CL_FLT_MAX_EXP = +128;
    public static final int CL_INVALID_ARG_SIZE = -51;
    public static final int CL_QUEUE_PROFILING_ENABLE = (1 << 1);
    public static final int CL_KERNEL_REFERENCE_COUNT = 4498;
    public static final int CL_KERNEL_ARG_TYPE_CONST = (1 << 0);
    public static final int CL_MEM_ALLOC_HOST_PTR = (1 << 4);
    public static final int CL_DEVICE_IMAGE2D_MAX_WIDTH = 4113;
    public static final int CL_BUILD_PROGRAM_FAILURE = -11;
    public static final int CL_COMMAND_COPY_BUFFER = 4597;
    public static final int CL_KERNEL_NUM_ARGS = 4497;
    public static final int CL_BUFFER_CREATE_TYPE_REGION = 4640;
    public static final int CL_COMMAND_BARRIER = 4613;
    public static final int CL_UNORM_SHORT_555 = 4309;
    public static final int CL_INVALID_PROPERTY = -64;
    public static final int CL_IMAGE_NUM_SAMPLES = 4378;
    public static final int CL_PROGRAM_SOURCE = 4452;
    public static final int CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR = 4102;
    public static final int CL_PROGRAM_BINARY_TYPE = 4484;
    public static final int CL_DEVICE_COMPILER_AVAILABLE = 4136;
    public static final int CL_FP_ROUND_TO_INF = (1 << 4);
    public static final int CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE = 4125;
    public static final int CL_IMAGE_ROW_PITCH = 4370;
    public static final int CL_INVALID_ARG_INDEX = -49;
    public static final int CL_LINK_PROGRAM_FAILURE = -17;
    public static final int CL_DEVICE_ENDIAN_LITTLE = 4134;
    public static final int CL_COMMAND_READ_BUFFER = 4595;
    public static final int CL_UNORM_INT_101010 = 4310;
    public static final int CL_KERNEL_WORK_GROUP_SIZE = 4528;
    public static final int CL_COMMAND_UNMAP_MEM_OBJECT = 4605;
    public static final int CL_INVALID_PLATFORM = -32;
    public static final int CL_INVALID_GL_SHAREGROUP_REFERENCE_KHR = -1000;
    public static final int CL_FLT_RADIX = 2;
    public static final int CL_DEVICE_PARTITION_BY_NAMES_EXT = 16466;
    public static final int CL_DEVICE_PREFERRED_VECTOR_WIDTH_INT = 4104;
    public static final int CL_PROGRAM_KERNEL_NAMES = 4456;
    public static final int CL_SHRT_MIN = (-32767 - 1);
    public static final int CL_INVALID_EVENT = -58;
    public static final int CL_RG = 4274;
    public static final int CL_RA = 4275;
    public static final int CL_PROGRAM_BUILD_OPTIONS = 4482;
    public static final int CL_INVALID_COMMAND_QUEUE = -36;
    public static final int cl_khr_icd = 1;
    public static final int CL_FP_ROUND_TO_NEAREST = (1 << 2);
    public static final int CL_HALF_FLOAT = 4317;
    public static final int CL_KERNEL_ARG_ADDRESS_LOCAL = 4508;
    public static final int CL_INVALID_BINARY = -42;
    public static final int CL_COMMAND_WRITE_IMAGE = 4599;
    public static final int CL_INVALID_KERNEL_DEFINITION = -47;
    public static final int CL_ADDRESS_CLAMP = 4402;
    public static final int CL_COMMAND_USER = 4612;
    public static final int CL_UNORM_SHORT_565 = 4308;
    public static final int CL_UNORM_INT16 = 4307;
    public static final double CL_M_2_PI = 0.636619772367581382433;
    public static final int CL_ADDRESS_REPEAT = 4403;
    public static final int CL_FALSE = 0;
    public static final int CL_Rx = 4282;
    public static final int CL_INVALID_GLOBAL_OFFSET = -56;
    public static final int CL_DEVICE_PREFERRED_INTEROP_USER_SYNC = 4168;
    public static final int CL_INVALID_PROGRAM = -44;
    public static final int CL_INVALID_KERNEL = -48;
    public static final int CL_MEM_SIZE = 4354;
    public static final int CL_AFFINITY_DOMAIN_L1_CACHE_EXT = 1;
    public static final int CL_PROGRAM_BINARIES = 4454;
    public static final int CL_DEVICE_TYPE_DEFAULT = (1 << 0);
    public static final int CL_DEVICE_IMAGE2D_MAX_HEIGHT = 4114;
    public static final int CL_MEM_HOST_WRITE_ONLY = (1 << 7);
    public static final int CL_INVALID_BUILD_OPTIONS = -43;
    public static final int CL_DEVICE_NOT_AVAILABLE = -2;
    public static final int CL_INVALID_VALUE = -30;
    public static final int CL_AFFINITY_DOMAIN_L3_CACHE_EXT = 3;
    public static final int CL_DEVICE_MEM_BASE_ADDR_ALIGN = 4121;
    public static final int CL_DEVICE_MAX_WORK_GROUP_SIZE = 4100;
    public static final int CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE = (1 << 0);
    public static final int CL_SAMPLER_NORMALIZED_COORDS = 4434;
    public static final int CL_EVENT_REFERENCE_COUNT = 4562;
    public static final int CL_MEM_HOST_PTR = 4355;
    public static final float CL_M_1_PI_F = 0.31830987334251f;
    public static final int CL_INVALID_LINKER_OPTIONS = -67;
    public static final int CL_MEM_OBJECT_ALLOCATION_FAILURE = -4;
    public static final int CL_INVALID_MEM_OBJECT = -38;
    public static final double CL_M_LN2 = 0.693147180559945286227;
    public static final int CL_COMPLETE = 0;
    public static final int CL_IMAGE_ARRAY_SIZE = 4375;
    public static final int CL_INTENSITY = 4280;
    public static final int CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF = 4156;
    public static final int CL_INVALID_PROGRAM_EXECUTABLE = -45;
    public static final int CL_KERNEL_ARG_TYPE_QUALIFIER = 4505;
    public static final int CL_MEM_WRITE_ONLY = (1 << 1);
    public static final int CL_GL_OBJECT_TEXTURE1D = 8207;
    public static final int CL_PROGRAM_CONTEXT = 4449;
    public static final int CL_PLATFORM_ICD_SUFFIX_KHR = 2336;
    public static final int CL_KERNEL_ARG_TYPE_NONE = 0;
    public static final int CL_KERNEL_ARG_ACCESS_WRITE_ONLY = 4513;
    public static final int CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST = -14;
    public static final int CL_SAMPLER_ADDRESSING_MODE = 4435;
    public static final int CL_MEM_CONTEXT = 4358;
    public static final int CL_DEVICE_IMAGE3D_MAX_HEIGHT = 4116;
    public static final int CL_KERNEL_ARG_ADDRESS_PRIVATE = 4510;
    public static final int CL_DEVICE_MAX_READ_IMAGE_ARGS = 4110;
    public static final int CL_DEVICE_PREFERRED_VECTOR_WIDTH_HALF = 4148;
    public static final int CL_DEVICE_NOT_FOUND = -1;
    public static final int CL_CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE = 268435459;
    public static final int CL_RGx = 4283;
    public static final int CL_DEVICE_MAX_PARAMETER_SIZE = 4119;
    public static final int CL_DEVICE_IMAGE3D_MAX_DEPTH = 4117;
    public static final int CL_GL_OBJECT_TEXTURE2D = 8193;
    public static final int CL_MEM_HOST_NO_ACCESS = (1 << 9);
    public static final int CL_INVALID_COMPILER_OPTIONS = -66;
    public static final int CL_DEVICE_PARTITION_BY_AFFINITY_DOMAIN_EXT = 16467;
    public static final int CL_DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE = (1 << 5);
    public static final int CL_DEVICE_TYPE_CUSTOM = (1 << 4);
    public static final int CL_MEM_USE_HOST_PTR = (1 << 3);
    public static final int CL_SIGNED_INT8 = 4311;
    public static final int CL_DEVICE_WARP_SIZE_NV = 16387;
    public static final int CL_DEVICE_OPENCL_C_VERSION = 4157;
    public static final int CL_DEVICE_ADDRESS_BITS = 4109;
    public static final int CL_DEVICE_PARTITION_BY_COUNTS_EXT = 16465;
    public static final int CL_GL_OBJECT_BUFFER = 8192;
    public static final int CL_SAMPLER_CONTEXT = 4433;
    public static final int CL_GL_OBJECT_TEXTURE3D = 8194;
    public static final int CL_PLATFORM_VERSION = 2305;
    public static final int CL_DRIVER_VERSION = 4141;
    public static final int CL_DEVICE_LOCAL_MEM_TYPE = 4130;
    public static final int CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE = 4122;
    public static final int CL_KERNEL_ARG_ACCESS_NONE = 4515;
    public static final int CL_DEVICE_VERSION = 4143;
    public static final int CL_CONTEXT_PROPERTY_USE_CGL_SHAREGROUP_APPLE = 268435456;
    public static final int CL_PLATFORM_NOT_FOUND_KHR = -1001;
    public static final float CL_M_2_SQRTPI_F = 1.12837922573090f;
    public static final int CL_SIGNED_INT32 = 4313;
    public static final int CL_READ_WRITE_CACHE = 2;
    public static final int CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT = 4151;
    public static final int CL_KERNEL_GLOBAL_WORK_SIZE = 4533;
    public static final int CL_KERNEL_COMPILE_WORK_GROUP_SIZE = 4529;
    public static final int CL_PLATFORM_PROFILE = 2304;
    public static final int CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT = 4154;
    public static final float CL_M_PI_4_F = 0.78539818525314f;
    public static final int CL_DEVICE_REFERENCE_COUNT = 4167;
    public static final int CL_PROFILING_COMMAND_END = 4739;
    public static final int CL_DEVICE_PROFILE = 4142;
    public static final int CL_INVALID_OPERATION = -59;
    public static final int CL_DEVICE_REFERENCE_COUNT_EXT = 16471;
    public static final int CL_DEVICE_AFFINITY_DOMAIN_L3_CACHE = (1 << 2);
    public static final int CL_MEM_TYPE = 4352;
    public static final int CL_INVALID_DEVICE_PARTITION_COUNT = -68;
    public static final int CL_KERNEL_CONTEXT = 4499;
    public static final int CL_DEVICE_MAX_CLOCK_FREQUENCY = 4108;
    public static final int CL_DEVICE_PARTITION_TYPE = 4166;
    public static final int CL_BLOCKING = 1;
    public static final int CL_EVENT_CONTEXT = 4564;
    public static final int CL_CONTEXT_NUM_DEVICES = 4227;
    public static final int CL_HAS_NAMED_VECTOR_FIELDS = 1;
    public static final int CL_GL_CONTEXT_KHR = 8200;
    public static final int CL_DEVICE_PROFILING_TIMER_RESOLUTION = 4133;
    public static final int CL_MIGRATE_MEM_OBJECT_HOST = (1 << 0);
    public static final int CL_KERNEL_ARG_ADDRESS_GLOBAL = 4507;
    public static final int CL_PROGRAM_BUILD_STATUS = 4481;
    public static final int CL_DEVICE_GLOBAL_MEM_CACHE_TYPE = 4124;
    public static final int CL_SUBMITTED = 2;
    public static final String CL_PROGRAM_STRING_DEBUG_INFO = "#line ";
    public static final int CL_DEVICE_AFFINITY_DOMAIN_NUMA = (1 << 0);
    public static final int CL_PLATFORM_NAME = 2306;
    public static final int CL_COMMAND_COPY_BUFFER_RECT = 4611;
    public static final int CL_COMPILER_NOT_AVAILABLE = -3;
    public static final int CL_SNORM_INT8 = 4304;
    public static final int CL_FP_FMA = (1 << 5);
    public static final int CL_CONTEXT_INTEROP_USER_SYNC = 4229;
    public static final int CL_PROFILING_COMMAND_START = 4738;
    public static final int CL_COMMAND_COPY_IMAGE = 4600;
    public static final int CL_DEVICE_MAX_WORK_ITEM_SIZES = 4101;
    public static final int CL_IMAGE_ELEMENT_SIZE = 4369;
    public static final int CL_DEVICE_PARENT_DEVICE = 4162;
    public static final int CL_DEVICE_PARTITION_EQUALLY_EXT = 16464;
    public static final int CL_INVALID_CONTEXT = -34;
    public static final int CL_IMAGE_HEIGHT = 4373;
    public static final int CL_DEVICE_HOST_UNIFIED_MEMORY = 4149;
    public static final int CL_COMMAND_MARKER = 4606;
    public static final int CL_KERNEL_ATTRIBUTES = 4501;
    public static final int CL_COMMAND_MIGRATE_MEM_OBJECTS = 4614;
    public static final int CL_INVALID_IMAGE_DESCRIPTOR = -65;
    public static final int CL_COMMAND_GL_FENCE_SYNC_OBJECT_KHR = 8205;
    public static final int CL_MAP_WRITE_INVALIDATE_REGION = (1 << 2);
    public static final int CL_AFFINITY_DOMAIN_L2_CACHE_EXT = 2;
    public static final int CL_EXEC_NATIVE_KERNEL = (1 << 1);
    public static final int CL_USHRT_MAX = 65535;
    public static final int CL_CURRENT_DEVICE_FOR_GL_CONTEXT_KHR = 8198;
    public static final int CL_KERNEL_PRIVATE_MEM_SIZE = 4532;
    public static final int CL_KERNEL_ARG_ADDRESS_CONSTANT = 4509;
    public static final int CL_DEVICE_PARTITION_BY_COUNTS_LIST_END = 0;
    public static final int CL_COMMAND_MAP_IMAGE = 4604;
    public static final int CL_GL_OBJECT_TEXTURE_BUFFER = 8209;
    public static final int CL_MIGRATE_MEM_OBJECT_CONTENT_UNDEFINED = (1 << 1);
    public static final int CL_EXEC_KERNEL = (1 << 0);
    public static final int CL_INVALID_GL_OBJECT = -60;
    public static final int CL_DEVICE_COMPUTE_CAPABILITY_MAJOR_NV = 16384;
    public static final int CL_COMMAND_READ_BUFFER_RECT = 4609;
    public static final int CL_QUEUE_DEVICE = 4241;
    public static final int CL_DEVICE_GPU_OVERLAP_NV = 16388;
    public static final int CL_DEVICE_EXTENSIONS = 4144;
    public static final int CL_KERNEL_ARG_TYPE_VOLATILE = (1 << 2);
    public static final int CL_DBL_MAX_10_EXP = +308;
    public static final int CL_FLT_MAX_10_EXP = +38;
    public static final int CL_DEVICE_PARENT_DEVICE_EXT = 16468;
    public static final int CL_MISALIGNED_SUB_BUFFER_OFFSET = -13;
    public static final int CL_EVENT_COMMAND_EXECUTION_STATUS = 4563;
    public static final int CL_DEVICE_MAX_WRITE_IMAGE_ARGS = 4111;
    public static final int CL_INVALID_HOST_PTR = -37;
    public static final float CL_M_SQRT2_F = 1.41421353816986f;
    public static final int CL_VERSION_1_1 = 1;
    public static final int CL_VERSION_1_2 = 1;
    public static final int CL_VERSION_1_0 = 1;
    public static final int CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE = 4107;
    public static final double CL_M_LOG2E = 1.442695040888963387005;
    public static final int CL_SHRT_MAX = 32767;
    public static final int CL_UNORM_INT8 = 4306;
    public static final int CL_DEVICE_QUEUE_PROPERTIES = 4138;
    public static final int CL_KERNEL_ARG_ACCESS_READ_WRITE = 4514;
    public static final int CL_DEVICE_PARTITION_AFFINITY_DOMAIN = 4165;
    public static final int CL_KERNEL_ARG_TYPE_NAME = 4504;
    public static final int CL_BUILD_SUCCESS = 0;
    public static final int CL_FP_DENORM = (1 << 0);
    public static final float CL_M_LOG10E_F = 0.43429449200630f;
    public static final int CL_GL_MIPMAP_LEVEL = 8197;
    public static final int CL_SIGNED_INT16 = 4312;
    public static final int CL_DEVICE_BUILT_IN_KERNELS = 4159;
    public static final int CL_INT_MIN = (-2147483647 - 1);
    public static final int CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT = 4103;
    public static final int CL_DEVICE_PARTITION_STYLE_EXT = 16472;
    public static final int CL_COMMAND_MAP_BUFFER = 4603;
    public static final int CL_MAP_WRITE = (1 << 1);
    public static final double CL_M_SQRT1_2 = 0.707106781186547572737;
    public static final float CL_M_LN10_F = 2.30258512496948f;
    public static final int CL_FILTER_NEAREST = 4416;
    public static final int CL_CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE = 268435458;
    public static final int CL_KERNEL_FUNCTION_NAME = 4496;
    public static final int cl_khr_gl_sharing = 1;
    public static final int CL_BUILD_ERROR = -2;
    public static final int CL_OUT_OF_HOST_MEMORY = -6;
    public static final int CL_MEM_OBJECT_IMAGE1D_ARRAY = 4341;
    public static final int CL_DEVICE_GLOBAL_MEM_CACHE_SIZE = 4126;
    public static final int CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS = 4099;
    public static final int CL_KERNEL_ARG_ACCESS_QUALIFIER = 4503;
    public static final int CL_EVENT_COMMAND_TYPE = 4561;
    public static final int CL_A = 4273;
    public static final int CL_DEVICES_FOR_GL_CONTEXT_KHR = 8199;
    public static final int CL_MEM_OFFSET = 4360;
    public static final int CL_RGB = 4276;
    public static final int CL_DEVICE_AFFINITY_DOMAIN_L4_CACHE = (1 << 1);
    public static final int CL_PROGRAM_BINARY_SIZES = 4453;
    public static final int CL_INVALID_DEVICE = -33;
    public static final int CL_R = 4272;
    public static final int CL_DEVICE_IMAGE_MAX_BUFFER_SIZE = 4160;
    public static final int CL_COMMAND_WRITE_BUFFER = 4596;
    public static final int CL_MEM_OBJECT_IMAGE1D = 4340;
    public static final int CL_INVALID_PARTITION_COUNT_EXT = -1058;
    public static final int CL_EGL_DISPLAY_KHR = 8201;
    public static final int CL_TRUE = 1;
    public static final int CL_BUILD_IN_PROGRESS = -3;
    public static final int CL_MEM_OBJECT_BUFFER = 4336;
    public static final float CL_M_PI_2_F = 1.57079637050629f;
    public static final int CL_DEVICE_AFFINITY_DOMAINS_EXT = 16470;
    public static final int CL_DEVICE_LINKER_AVAILABLE = 4158;
    public static final int CL_CONTEXT_PROPERTIES = 4226;
    public static final int CL_SCHAR_MIN = (-127 - 1);
    public static final int CL_FP_SOFT_FLOAT = (1 << 6);
    public static final int CL_DEVICE_VENDOR = 4140;
    public static final int CL_BUILD_NONE = -1;
    public static final int CL_FLT_DIG = 6;
    public static final int CL_MEM_OBJECT_IMAGE2D = 4337;
    public static final double CL_M_PI = 3.141592653589793115998;
    public static final int CL_IMAGE_FORMAT = 4368;
    public static final int CL_PLATFORM_VENDOR = 2307;
    public static final int CL_DEVICE_MAX_MEM_ALLOC_SIZE = 4112;
    public static final int CL_DEVICE_IMAGE_MAX_ARRAY_SIZE = 4161;
    public static final int CL_PROFILING_COMMAND_QUEUED = 4736;
    public static final float CL_M_LN2_F = 0.69314718246460f;
    public static final int CL_DEVICE_PARTITION_TYPES_EXT = 16469;
    public static final int CL_FILTER_LINEAR = 4417;
    public static final int CL_COMMAND_FILL_BUFFER = 4615;
    public static final int CL_DEVICE_IMAGE_SUPPORT = 4118;
    public static final int CL_DEVICE_TYPE_ACCELERATOR = (1 << 3);
    public static final int CL_PROGRAM_BUILD_LOG = 4483;
    public static final int CL_IMAGE_DEPTH = 4374;
    public static final int CL_KERNEL_PROGRAM = 4500;
    public static final int CL_KERNEL_ARG_ADDRESS_QUALIFIER = 4502;
    public static final int CL_MEM_OBJECT_IMAGE3D = 4338;
    public static final double CL_M_1_PI = 0.318309886183790691216;
    public static final float CL_M_E_F = 2.71828174591064f;
    public static final int CL_FLT_MANT_DIG = 24;
    public static final int CL_GL_OBJECT_TEXTURE1D_ARRAY = 8208;
    public static final int CL_PROGRAM_BINARY_TYPE_EXECUTABLE = 4;
    public static final int CL_LOCAL = 1;
    public static final int CL_DEVICE_PROFILING_TIMER_OFFSET_AMD = 16438;
    public static final int CL_QUEUE_REFERENCE_COUNT = 4242;
    public static final int CL_DEVICE_PARTITION_FAILED_EXT = -1057;
    public static final int CL_DEVICE_AVAILABLE = 4135;
    public static final double CL_M_LOG10E = 0.434294481903251816668;
    public static final int CL_IMAGE_FORMAT_NOT_SUPPORTED = -10;
    public static final int CL_DBL_MAX_EXP = +1024;
    public static final int CL_UCHAR_MAX = 255;
    public static final int CL_DBL_MIN_10_EXP = -307;
    public static final int CL_DEVICE_MAX_SAMPLERS = 4120;
    public static final int CL_MEM_COPY_OVERLAP = -8;
    public static final int CL_MAP_READ = (1 << 0);
    public static final int CL_DEVICE_AFFINITY_DOMAIN_L2_CACHE = (1 << 3);
    public static final int CL_DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE = 4155;
    public static final int CL_COMMAND_READ_IMAGE = 4598;
    public static final int CL_CHAR_MAX = 127;
    public static final int CL_PROGRAM_NUM_DEVICES = 4450;
    public static final int CL_UNSIGNED_INT8 = 4314;
    public static final int CL_DBL_DIG = 15;
    public static final int cl_APPLE_ContextLoggingFunctions = 1;
    public static final int CL_WGL_HDC_KHR = 8203;
    public static final int CL_DBL_MANT_DIG = 53;
    public static final int CL_COMMAND_COPY_BUFFER_TO_IMAGE = 4602;
    public static final int CL_CGL_SHAREGROUP_KHR = 8204;
    public static final int CL_PROGRAM_DEVICES = 4451;
    public static final int CL_SAMPLER_REFERENCE_COUNT = 4432;
    public static final int CL_MEM_READ_WRITE = (1 << 0);
    public static final int CL_INVALID_KERNEL_NAME = -46;
    public static final int CL_DEVICE_EXECUTION_CAPABILITIES = 4137;
    public static final int CL_DEVICE_NAME = 4139;
    public static final int CL_DEVICE_INTEGRATED_MEMORY_NV = 16390;
    public static final int CL_MEM_REFERENCE_COUNT = 4357;
    public static final int CL_INVALID_IMAGE_FORMAT_DESCRIPTOR = -39;
    public static final int cl_ext_device_fission = 1;
    public static final int CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE = 4128;
    public static final int CL_MEM_OBJECT_IMAGE2D_ARRAY = 4339;
    public static final int CL_MAP_FAILURE = -12;
    public static final int CL_DEVICE_PARTITION_EQUALLY = 4230;
    public static final int CL_IMAGE_SLICE_PITCH = 4371;
    public static final int CL_LUMINANCE = 4281;
    public static final int CL_ADDRESS_CLAMP_TO_EDGE = 4401;
    public static final int CL_DEVICE_AFFINITY_DOMAIN_L1_CACHE = (1 << 4);
    public static final int CL_GL_OBJECT_RENDERBUFFER = 8195;
    public static final int CL_DEVICE_NATIVE_VECTOR_WIDTH_INT = 4152;
    public static final int CL_SAMPLER_FILTER_MODE = 4436;
    public static final int CL_INVALID_QUEUE_PROPERTIES = -35;
    public static final int CL_INVALID_GLOBAL_WORK_SIZE = -63;
    public static final int CL_INT_MAX = 2147483647;
    public static final int CL_AFFINITY_DOMAIN_NUMA_EXT = 16;
    public static final int CL_FLT_MIN_10_EXP = -37;
    public static final int CL_AFFINITY_DOMAIN_L4_CACHE_EXT = 4;
    public static final int CL_MEM_COPY_HOST_PTR = (1 << 5);
    public static final int CL_DEVICE_PARTITION_BY_AFFINITY_DOMAIN = 4232;
    public static final int CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE = 4531;
    public static final int CL_MEM_FLAGS = 4353;
    public static final int CL_DEVICE_PARTITION_PROPERTIES = 4164;
    public static final int CL_COMMAND_TASK = 4593;
    public static final int CL_FP_CORRECTLY_ROUNDED_DIVIDE_SQRT = (1 << 7);
    public static final int CL_DEVICE_DOUBLE_FP_CONFIG = 4146;
    public static final int CL_DEVICE_HALF_FP_CONFIG = 4147;
    public static final int CL_FP_ROUND_TO_ZERO = (1 << 3);
    public static final int CL_RUNNING = 1;
    public static final int CL_DEVICE_IMAGE3D_MAX_WIDTH = 4115;
    public static final int CL_DEVICE_PLATFORM = 4145;
    public static final int CL_INVALID_WORK_DIMENSION = -53;
    public static final int CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG = 4153;
    public static final int CL_PROGRAM_BINARY_TYPE_LIBRARY = 2;
    public static final double CL_M_E = 2.718281828459045090796;
    public static final int CL_INVALID_SAMPLER = -41;

    /// Original signature : <code>cl_int clBuildProgram(cl_program, cl_uint, const cl_device_id*, const char*, clBuildProgram_arg1_callback, void*)</code>
    int clBuildProgram(@Ptr long cl_program1, int cl_uint1, @Ptr long cl_device_idPtr1, @Ptr long charPtr1, @Ptr long arg1, @Ptr long voidPtr1);

    /// Original signature : <code>cl_int clCompileProgram(cl_program, cl_uint, const cl_device_id*, const char*, cl_uint, const cl_program*, const char**, clCompileProgram_arg1_callback, void*)</code>
    @Optional
    int clCompileProgram(OpenCLLibrary.cl_program cl_program1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Byte> charPtr1, int cl_uint2, Pointer<OpenCLLibrary.cl_program> cl_programPtr1, Pointer<Pointer<Byte>> charPtrPtr1, Pointer<OpenCLLibrary.clCompileProgram_arg1_callback> arg1, Pointer<?> voidPtr1);

    /**
     * Memory Object APIs<br>
     * Original signature : <code>cl_mem clCreateBuffer(cl_context, cl_mem_flags, size_t, void*, cl_int*)</code>
     */
    @Ptr
    long clCreateBuffer(@Ptr long cl_context1, long cl_mem_flags1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /**
     * Command Queue APIs<br>
     * Original signature : <code>cl_command_queue clCreateCommandQueue(cl_context, cl_device_id, cl_command_queue_properties, cl_int*)</code>
     */
    @Ptr
    long clCreateCommandQueue(@Ptr long cl_context1, @Ptr long cl_device_id1, long cl_command_queue_properties1, @Ptr long cl_intPtr1);

    /**
     * Context APIs<br>
     * Original signature : <code>cl_context clCreateContext(const cl_context_properties*, cl_uint, const cl_device_id*, clCreateContext_arg1_callback, void*, cl_int*)</code>
     */
    @Ptr
    long clCreateContext(@Ptr long cl_context_propertiesPtr1, int cl_uint1, @Ptr long cl_device_idPtr1, @Ptr long arg1, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_context clCreateContextFromType(const cl_context_properties*, cl_device_type, clCreateContextFromType_arg1_callback, void*, cl_int*)</code>
    OpenCLLibrary.cl_context clCreateContextFromType(Pointer<Pointer<Integer>> cl_context_propertiesPtr1, long cl_device_type1, Pointer<OpenCLLibrary.clCreateContextFromType_arg1_callback> arg1, Pointer<?> voidPtr1, Pointer<Integer> cl_intPtr1);

    /// Original signature : <code>cl_event clCreateEventFromGLsyncKHR(cl_context, cl_GLsync, cl_int*)</code>
    @Optional
    OpenCLLibrary.cl_event clCreateEventFromGLsyncKHR(OpenCLLibrary.cl_context cl_context1, OpenCLLibrary.cl_GLsync cl_GLsync1, Pointer<Integer> cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLBuffer(cl_context, cl_mem_flags, cl_GLuint, int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLBuffer(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLuint1, @Ptr long intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLRenderbuffer(cl_context, cl_mem_flags, cl_GLuint, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLRenderbuffer(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLuint1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLTexture(cl_context, cl_mem_flags, cl_GLenum, cl_GLint, cl_GLuint, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLTexture(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLenum1, int cl_GLint1, int cl_GLuint1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLTexture2D(cl_context, cl_mem_flags, cl_GLenum, cl_GLint, cl_GLuint, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLTexture2D(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLenum1, int cl_GLint1, int cl_GLuint1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLTexture3D(cl_context, cl_mem_flags, cl_GLenum, cl_GLint, cl_GLuint, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLTexture3D(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLenum1, int cl_GLint1, int cl_GLuint1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateImage(cl_context, cl_mem_flags, const cl_image_format*, const cl_image_desc*, void*, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateImage(@Ptr long cl_context1, long cl_mem_flags1, @Ptr long cl_image_formatPtr1, @Ptr long cl_image_descPtr1, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateImage2D(cl_context, cl_mem_flags, const cl_image_format*, size_t, size_t, size_t, void*, cl_int*)</code>
    @Ptr
    long clCreateImage2D(@Ptr long cl_context1, long cl_mem_flags1, @Ptr long cl_image_formatPtr1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateImage3D(cl_context, cl_mem_flags, const cl_image_format*, size_t, size_t, size_t, size_t, size_t, void*, cl_int*)</code>
    @Ptr
    long clCreateImage3D(@Ptr long cl_context1, long cl_mem_flags1, @Ptr long cl_image_formatPtr1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long size_t4, @Ptr long size_t5, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /**
     * Kernel Object APIs<br>
     * Original signature : <code>cl_kernel clCreateKernel(cl_program, const char*, cl_int*)</code>
     */
    @Ptr
    long clCreateKernel(@Ptr long cl_program1, @Ptr long charPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_int clCreateKernelsInProgram(cl_program, cl_uint, cl_kernel*, cl_uint*)</code>
    int clCreateKernelsInProgram(@Ptr long cl_program1, int cl_uint1, @Ptr long cl_kernelPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_program clCreateProgramWithBinary(cl_context, cl_uint, const cl_device_id*, const size_t*, const unsigned char**, cl_int*, cl_int*)</code>
    @Ptr
    long clCreateProgramWithBinary(@Ptr long cl_context1, int cl_uint1, @Ptr long cl_device_idPtr1, @Ptr long size_tPtr1, @Ptr long charPtrPtr1, @Ptr long cl_intPtr1, @Ptr long cl_intPtr2);

    /// Original signature : <code>cl_program clCreateProgramWithBuiltInKernels(cl_context, cl_uint, const cl_device_id*, const char*, cl_int*)</code>
    @Optional
    OpenCLLibrary.cl_program clCreateProgramWithBuiltInKernels(OpenCLLibrary.cl_context cl_context1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Byte> charPtr1, Pointer<Integer> cl_intPtr1);

    /**
     * Program Object APIs<br>
     * Original signature : <code>cl_program clCreateProgramWithSource(cl_context, cl_uint, const char**, const size_t*, cl_int*)</code>
     */
    @Ptr
    long clCreateProgramWithSource(@Ptr long cl_context1, int cl_uint1, @Ptr long charPtrPtr1, @Ptr long size_tPtr1, @Ptr long cl_intPtr1);

    /**
     * Sampler APIs<br>
     * Original signature : <code>cl_sampler clCreateSampler(cl_context, cl_bool, cl_addressing_mode, cl_filter_mode, cl_int*)</code>
     */
    @Ptr
    long clCreateSampler(@Ptr long cl_context1, int cl_bool1, int cl_addressing_mode1, int cl_filter_mode1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateSubBuffer(cl_mem, cl_mem_flags, cl_buffer_create_type, const void*, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateSubBuffer(@Ptr long cl_mem1, long cl_mem_flags1, int cl_buffer_create_type1, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_int clCreateSubDevices(cl_device_id, const cl_device_partition_property*, cl_uint, cl_device_id*, cl_uint*)</code>
    @Optional
    int clCreateSubDevices(OpenCLLibrary.cl_device_id cl_device_id1, Pointer<Pointer<Integer>> cl_device_partition_propertyPtr1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Integer> cl_uintPtr1);

    /// Original signature : <code>cl_int clCreateSubDevicesEXT(cl_device_id, const cl_device_partition_property_ext*, cl_uint, cl_device_id*, cl_uint*)</code>
    @Optional
    int clCreateSubDevicesEXT(OpenCLLibrary.cl_device_id cl_device_id1, Pointer<Long> cl_device_partition_property_extPtr1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Integer> cl_uintPtr1);

    /// Original signature : <code>cl_event clCreateUserEvent(cl_context, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateUserEvent(@Ptr long cl_context1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_int clEnqueueAcquireGLObjects(cl_command_queue, cl_uint, const cl_mem*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueAcquireGLObjects(@Ptr long cl_command_queue1, int cl_uint1, @Ptr long cl_memPtr1, int cl_uint2, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueBarrier(cl_command_queue)</code>
    int clEnqueueBarrier(@Ptr long cl_command_queue1);

    /// Original signature : <code>cl_int clEnqueueBarrierWithWaitList(cl_command_queue, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueBarrierWithWaitList(OpenCLLibrary.cl_command_queue cl_command_queue1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyBuffer(cl_command_queue, cl_mem, cl_mem, size_t, size_t, size_t, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueCopyBuffer(@Ptr long cl_command_queue1, @Ptr long cl_mem1, @Ptr long cl_mem2, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyBufferRect(cl_command_queue, cl_mem, cl_mem, const size_t*, const size_t*, const size_t*, size_t, size_t, size_t, size_t, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueCopyBufferRect(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, OpenCLLibrary.cl_mem cl_mem2, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, Pointer<SizeT> size_tPtr3, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long size_t4, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyBufferToImage(cl_command_queue, cl_mem, cl_mem, size_t, const size_t*, const size_t*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueCopyBufferToImage(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, OpenCLLibrary.cl_mem cl_mem2, @Ptr long size_t1, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyImage(cl_command_queue, cl_mem, cl_mem, const size_t*, const size_t*, const size_t*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueCopyImage(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, OpenCLLibrary.cl_mem cl_mem2, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, Pointer<SizeT> size_tPtr3, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyImageToBuffer(cl_command_queue, cl_mem, cl_mem, const size_t*, const size_t*, size_t, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueCopyImageToBuffer(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, OpenCLLibrary.cl_mem cl_mem2, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, @Ptr long size_t1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueFillBuffer(cl_command_queue, cl_mem, const void*, size_t, size_t, size_t, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueFillBuffer(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, Pointer<?> voidPtr1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueFillImage(cl_command_queue, cl_mem, const void*, const size_t*, const size_t*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueFillImage(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, Pointer<?> voidPtr1, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>void* clEnqueueMapBuffer(cl_command_queue, cl_mem, cl_bool, cl_map_flags, size_t, size_t, cl_uint, const cl_event*, cl_event*, cl_int*)</code>
    @Ptr
    long clEnqueueMapBuffer(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, long cl_map_flags1, @Ptr long size_t1, @Ptr long size_t2, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2, @Ptr long cl_intPtr1);

    /// Original signature : <code>void* clEnqueueMapImage(cl_command_queue, cl_mem, cl_bool, cl_map_flags, const size_t*, const size_t*, size_t*, size_t*, cl_uint, const cl_event*, cl_event*, cl_int*)</code>
    @Ptr
    long clEnqueueMapImage(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, long cl_map_flags1, @Ptr long size_tPtr1, @Ptr long size_tPtr2, @Ptr long size_tPtr3, @Ptr long size_tPtr4, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_int clEnqueueMarker(cl_command_queue, cl_event*)</code>
    int clEnqueueMarker(@Ptr long cl_command_queue1, @Ptr long cl_eventPtr1);

    /// Original signature : <code>cl_int clEnqueueMarkerWithWaitList(cl_command_queue, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueMarkerWithWaitList(OpenCLLibrary.cl_command_queue cl_command_queue1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueMigrateMemObjects(cl_command_queue, cl_uint, const cl_mem*, cl_mem_migration_flags, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueMigrateMemObjects(OpenCLLibrary.cl_command_queue cl_command_queue1, int cl_uint1, Pointer<OpenCLLibrary.cl_mem> cl_memPtr1, long cl_mem_migration_flags1, int cl_uint2, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueNDRangeKernel(cl_command_queue, cl_kernel, cl_uint, const size_t*, const size_t*, const size_t*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueNDRangeKernel(@Ptr long cl_command_queue1, @Ptr long cl_kernel1, int cl_uint1, @Ptr long size_tPtr1, @Ptr long size_tPtr2, @Ptr long size_tPtr3, int cl_uint2, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueNativeKernel(cl_command_queue, clEnqueueNativeKernel_arg1_callback, void*, size_t, cl_uint, const cl_mem*, const void**, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueNativeKernel(OpenCLLibrary.cl_command_queue cl_command_queue1, Pointer<OpenCLLibrary.clEnqueueNativeKernel_arg1_callback> arg1, Pointer<?> voidPtr1, @Ptr long size_t1, int cl_uint1, Pointer<OpenCLLibrary.cl_mem> cl_memPtr1, Pointer<Pointer<?>> voidPtrPtr1, int cl_uint2, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /**
     * Enqueued Commands APIs<br>
     * Original signature : <code>cl_int clEnqueueReadBuffer(cl_command_queue, cl_mem, cl_bool, size_t, size_t, void*, cl_uint, const cl_event*, cl_event*)</code>
     */
    int clEnqueueReadBuffer(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueReadBufferRect(cl_command_queue, cl_mem, cl_bool, const size_t*, const size_t*, const size_t*, size_t, size_t, size_t, size_t, void*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueReadBufferRect(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, int cl_bool1, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, Pointer<SizeT> size_tPtr3, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long size_t4, Pointer<?> voidPtr1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueReadImage(cl_command_queue, cl_mem, cl_bool, const size_t*, const size_t*, size_t, size_t, void*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueReadImage(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, @Ptr long size_tPtr1, @Ptr long size_tPtr2, @Ptr long size_t1, @Ptr long size_t2, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueReleaseGLObjects(cl_command_queue, cl_uint, const cl_mem*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueReleaseGLObjects(@Ptr long cl_command_queue1, int cl_uint1, @Ptr long cl_memPtr1, int cl_uint2, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueTask(cl_command_queue, cl_kernel, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueTask(@Ptr long cl_command_queue1, @Ptr long cl_kernel1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueUnmapMemObject(cl_command_queue, cl_mem, void*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueUnmapMemObject(@Ptr long cl_command_queue1, @Ptr long cl_mem1, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueWaitForEvents(cl_command_queue, cl_uint, const cl_event*)</code>
    int clEnqueueWaitForEvents(@Ptr long cl_command_queue1, int cl_uint1, @Ptr long cl_eventPtr1);

    /// Original signature : <code>cl_int clEnqueueWriteBuffer(cl_command_queue, cl_mem, cl_bool, size_t, size_t, const void*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueWriteBuffer(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueWriteBufferRect(cl_command_queue, cl_mem, cl_bool, const size_t*, const size_t*, const size_t*, size_t, size_t, size_t, size_t, const void*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueWriteBufferRect(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, int cl_bool1, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, Pointer<SizeT> size_tPtr3, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long size_t4, Pointer<?> voidPtr1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueWriteImage(cl_command_queue, cl_mem, cl_bool, const size_t*, const size_t*, size_t, size_t, const void*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueWriteImage(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, @Ptr long size_tPtr1, @Ptr long size_tPtr2, @Ptr long size_t1, @Ptr long size_t2, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clFinish(cl_command_queue)</code>
    int clFinish(@Ptr long cl_command_queue1);

    /**
     * Flush and Finish APIs<br>
     * Original signature : <code>cl_int clFlush(cl_command_queue)</code>
     */
    int clFlush(@Ptr long cl_command_queue1);

    /// Original signature : <code>cl_int clGetCommandQueueInfo(cl_command_queue, cl_command_queue_info, size_t, void*, size_t*)</code>
    int clGetCommandQueueInfo(@Ptr long cl_command_queue1, int cl_command_queue_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetContextInfo(cl_context, cl_context_info, size_t, void*, size_t*)</code>
    int clGetContextInfo(@Ptr long cl_context1, int cl_context_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /**
     * Device APIs<br>
     * Original signature : <code>cl_int clGetDeviceIDs(cl_platform_id, cl_device_type, cl_uint, cl_device_id*, cl_uint*)</code>
     */
    int clGetDeviceIDs(@Ptr long cl_platform_id1, long cl_device_type1, int cl_uint1, @Ptr long cl_device_idPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_int clGetDeviceInfo(cl_device_id, cl_device_info, size_t, void*, size_t*)</code>
    int clGetDeviceInfo(@Ptr long cl_device_id1, int cl_device_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetEventInfo(cl_event, cl_event_info, size_t, void*, size_t*)</code>
    int clGetEventInfo(@Ptr long cl_event1, int cl_event_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /**
     * Profiling APIs<br>
     * Original signature : <code>cl_int clGetEventProfilingInfo(cl_event, cl_profiling_info, size_t, void*, size_t*)</code>
     */
    int clGetEventProfilingInfo(@Ptr long cl_event1, int cl_profiling_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>void* clGetExtensionFunctionAddress(const char*)</code>
    Pointer<?> clGetExtensionFunctionAddress(Pointer<Byte> charPtr1);

    /**
     * Extension function access<br>
     * * Returns the extension function address for the given function name,<br>
     * or NULL if a valid function can not be found.  The client must<br>
     * check to make sure the address is not NULL, before using or <br>
     * calling the returned function address.<br>
     * Original signature : <code>void* clGetExtensionFunctionAddressForPlatform(cl_platform_id, const char*)</code>
     */
    @Optional
    Pointer<?> clGetExtensionFunctionAddressForPlatform(OpenCLLibrary.cl_platform_id cl_platform_id1, Pointer<Byte> charPtr1);

    /**
     * Apple extension for retrieving OpenGL context information for a CL context <br>
     * created via the above method.<br>
     * * Provides a query mechanism to retrieve OpenGL context specific information <br>
     * from an OpenCL context to help identify device specific mappings and usage.<br>
     * <br>
     * For example, one possible usage would be to allow the client to map a CGL <br>
     * virtual screen index to an appropriate CL device id to insure that the <br>
     * rendering device and the compute device are the same, thus guaranteeing <br>
     * any shared OpenGL memory that is attached o a CL memory object remains <br>
     * resident on the active device.<br>
     * context<br>
     * Original signature : <code>cl_int clGetGLContextInfoAPPLE(cl_context, void*, cl_gl_platform_info, size_t, void*, size_t*)</code>
     */
    @Optional
    int clGetGLContextInfoAPPLE(@Ptr long cl_context1, @Ptr long voidPtr1, int cl_gl_platform_info1, @Ptr long size_t1, @Ptr long voidPtr2, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetGLContextInfoKHR(const cl_context_properties*, cl_gl_context_info, size_t, void*, size_t*)</code>
    @Optional
    int clGetGLContextInfoKHR(@Ptr long cl_context_propertiesPtr1, int cl_gl_context_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetGLObjectInfo(cl_mem, cl_gl_object_type*, cl_GLuint*)</code>
    @Optional
    int clGetGLObjectInfo(@Ptr long cl_mem1, @Ptr long cl_gl_object_typePtr1, @Ptr long cl_GLuintPtr1);

    /// Original signature : <code>cl_int clGetGLTextureInfo(cl_mem, cl_gl_texture_info, size_t, void*, size_t*)</code>
    @Optional
    int clGetGLTextureInfo(@Ptr long cl_mem1, int cl_gl_texture_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetImageInfo(cl_mem, cl_image_info, size_t, void*, size_t*)</code>
    int clGetImageInfo(@Ptr long cl_mem1, int cl_image_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetKernelArgInfo(cl_kernel, cl_uint, cl_kernel_arg_info, size_t, void*, size_t*)</code>
    @Optional
    int clGetKernelArgInfo(@Ptr long cl_kernel1, int cl_uint1, int cl_kernel_arg_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetKernelInfo(cl_kernel, cl_kernel_info, size_t, void*, size_t*)</code>
    int clGetKernelInfo(@Ptr long cl_kernel1, int cl_kernel_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetKernelWorkGroupInfo(cl_kernel, cl_device_id, cl_kernel_work_group_info, size_t, void*, size_t*)</code>
    int clGetKernelWorkGroupInfo(@Ptr long cl_kernel1, @Ptr long cl_device_id1, int cl_kernel_work_group_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetMemObjectInfo(cl_mem, cl_mem_info, size_t, void*, size_t*)</code>
    int clGetMemObjectInfo(@Ptr long cl_mem1, int cl_mem_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /**
     * Platform API<br>
     * Original signature : <code>cl_int clGetPlatformIDs(cl_uint, cl_platform_id*, cl_uint*)</code>
     */
    int clGetPlatformIDs(int cl_uint1, @Ptr long cl_platform_idPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_int clGetPlatformInfo(cl_platform_id, cl_platform_info, size_t, void*, size_t*)</code>
    int clGetPlatformInfo(@Ptr long cl_platform_id1, int cl_platform_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetProgramBuildInfo(cl_program, cl_device_id, cl_program_build_info, size_t, void*, size_t*)</code>
    int clGetProgramBuildInfo(@Ptr long cl_program1, @Ptr long cl_device_id1, int cl_program_build_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetProgramInfo(cl_program, cl_program_info, size_t, void*, size_t*)</code>
    int clGetProgramInfo(@Ptr long cl_program1, int cl_program_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetSamplerInfo(cl_sampler, cl_sampler_info, size_t, void*, size_t*)</code>
    int clGetSamplerInfo(@Ptr long cl_sampler1, int cl_sampler_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetSupportedImageFormats(cl_context, cl_mem_flags, cl_mem_object_type, cl_uint, cl_image_format*, cl_uint*)</code>
    int clGetSupportedImageFormats(@Ptr long cl_context1, long cl_mem_flags1, int cl_mem_object_type1, int cl_uint1, @Ptr long cl_image_formatPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_int clIcdGetPlatformIDsKHR(cl_uint, cl_platform_id*, cl_uint*)</code>
    @Optional
    int clIcdGetPlatformIDsKHR(int cl_uint1, @Ptr long cl_platform_idPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_program clLinkProgram(cl_context, cl_uint, const cl_device_id*, const char*, cl_uint, const cl_program*, clLinkProgram_arg1_callback, void*, cl_int*)</code>
    @Optional
    OpenCLLibrary.cl_program clLinkProgram(OpenCLLibrary.cl_context cl_context1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Byte> charPtr1, int cl_uint2, Pointer<OpenCLLibrary.cl_program> cl_programPtr1, Pointer<OpenCLLibrary.clLinkProgram_arg1_callback> arg1, Pointer<?> voidPtr1, Pointer<Integer> cl_intPtr1);

    /**
     * clLogMessagesToStderr sends all log messages to the file descriptor stderr<br>
     * errstr<br>
     * Original signature : <code>void clLogMessagesToStderrAPPLE(const char*, const void*, size_t, void*)</code>
     */
    @Optional
    void clLogMessagesToStderrAPPLE(Pointer<Byte> charPtr1, Pointer<?> voidPtr1, @Ptr long size_t1, Pointer<?> voidPtr2);

    /**
     * clLogMessagesToStdout sends all log messages to the file descriptor stdout<br>
     * errstr<br>
     * Original signature : <code>void clLogMessagesToStdoutAPPLE(const char*, const void*, size_t, void*)</code>
     */
    @Optional
    void clLogMessagesToStdoutAPPLE(Pointer<Byte> charPtr1, Pointer<?> voidPtr1, @Ptr long size_t1, Pointer<?> voidPtr2);

    /**
     * errstr<br>
     * Original signature : <code>void clLogMessagesToSystemLogAPPLE(const char*, const void*, size_t, void*)</code>
     */
    @Optional
    void clLogMessagesToSystemLogAPPLE(Pointer<Byte> charPtr1, Pointer<?> voidPtr1, @Ptr long size_t1, Pointer<?> voidPtr2);

    /// Original signature : <code>cl_int clReleaseCommandQueue(cl_command_queue)</code>
    int clReleaseCommandQueue(@Ptr long cl_command_queue1);

    /// Original signature : <code>cl_int clReleaseContext(cl_context)</code>
    int clReleaseContext(@Ptr long cl_context1);

    /// Original signature : <code>cl_int clReleaseDevice(cl_device_id)</code>
    @Optional
    int clReleaseDevice(@Ptr long cl_device_id1);

    /// Original signature : <code>cl_int clReleaseDeviceEXT(cl_device_id)</code>
    @Optional
    int clReleaseDeviceEXT(@Ptr long cl_device_id1);

    /// Original signature : <code>cl_int clReleaseEvent(cl_event)</code>
    int clReleaseEvent(@Ptr long cl_event1);

    /// Original signature : <code>cl_int clReleaseKernel(cl_kernel)</code>
    int clReleaseKernel(@Ptr long cl_kernel1);

    /// Original signature : <code>cl_int clReleaseMemObject(cl_mem)</code>
    int clReleaseMemObject(@Ptr long cl_mem1);

    /// Original signature : <code>cl_int clReleaseProgram(cl_program)</code>
    int clReleaseProgram(@Ptr long cl_program1);

    /// Original signature : <code>cl_int clReleaseSampler(cl_sampler)</code>
    int clReleaseSampler(@Ptr long cl_sampler1);

    /// Original signature : <code>cl_int clRetainCommandQueue(cl_command_queue)</code>
    int clRetainCommandQueue(@Ptr long cl_command_queue1);

    /// Original signature : <code>cl_int clRetainContext(cl_context)</code>
    int clRetainContext(@Ptr long cl_context1);

    /// Original signature : <code>cl_int clRetainDevice(cl_device_id)</code>
    @Optional
    int clRetainDevice(@Ptr long cl_device_id1);

    /// Original signature : <code>cl_int clRetainDeviceEXT(cl_device_id)</code>
    @Optional
    int clRetainDeviceEXT(@Ptr long cl_device_id1);

    /// Original signature : <code>cl_int clRetainEvent(cl_event)</code>
    int clRetainEvent(@Ptr long cl_event1);

    /// Original signature : <code>cl_int clRetainKernel(cl_kernel)</code>
    int clRetainKernel(@Ptr long cl_kernel1);

    /// Original signature : <code>cl_int clRetainMemObject(cl_mem)</code>
    int clRetainMemObject(@Ptr long cl_mem1);

    /// Original signature : <code>cl_int clRetainProgram(cl_program)</code>
    int clRetainProgram(@Ptr long cl_program1);

    /// Original signature : <code>cl_int clRetainSampler(cl_sampler)</code>
    int clRetainSampler(@Ptr long cl_sampler1);

    /**
     * WARNING:<br>
     *     This API introduces mutable state into the OpenCL implementation. It has been REMOVED<br>
     *  to better facilitate thread safety.  The 1.0 API is not thread safe. It is not tested by the<br>
     *  OpenCL 1.1 conformance test, and consequently may not work or may not work dependably.<br>
     *  It is likely to be non-performant. Use of this API is not advised. Use at your own risk.<br>
     * *  Software developers previously relying on this API are instructed to set the command queue <br>
     *  properties when creating the queue, instead.<br>
     * Original signature : <code>cl_int clSetCommandQueueProperty(cl_command_queue, cl_command_queue_properties, cl_bool, cl_command_queue_properties*)</code>
     */
    int clSetCommandQueueProperty(@Ptr long cl_command_queue1, long cl_command_queue_properties1, int cl_bool1, @Ptr long cl_command_queue_propertiesPtr1);

    /// Original signature : <code>cl_int clSetEventCallback(cl_event, cl_int, clSetEventCallback_arg1_callback, void*)</code>
    @Optional
    int clSetEventCallback(@Ptr long cl_event1, int cl_int1, @Ptr long arg1, @Ptr long voidPtr1);

    /// Original signature : <code>cl_int clSetKernelArg(cl_kernel, cl_uint, size_t, const void*)</code>
    int clSetKernelArg(@Ptr long cl_kernel1, int cl_uint1, @Ptr long size_t1, @Ptr long voidPtr1);

    /**
     * memobj<br>
     * Original signature : <code>cl_int clSetMemObjectDestructorAPPLE(cl_mem, clSetMemObjectDestructorAPPLE_arg1_callback, void*)</code>
     */
    @Optional
    int clSetMemObjectDestructorAPPLE(OpenCLLibrary.cl_mem cl_mem1, Pointer<OpenCLLibrary.clSetMemObjectDestructorAPPLE_arg1_callback> arg1, Pointer<?> voidPtr1);

    /// Original signature : <code>cl_int clSetMemObjectDestructorCallback(cl_mem, clSetMemObjectDestructorCallback_arg1_callback, void*)</code>
    @Optional
    int clSetMemObjectDestructorCallback(@Ptr long cl_mem1, @Ptr long arg1, @Ptr long voidPtr1);

    /// Original signature : <code>cl_int clSetPrintfCallback(cl_context, clSetPrintfCallback_arg1_callback, void*)</code>
    @Optional
    int clSetPrintfCallback(OpenCLLibrary.cl_context cl_context1, Pointer<OpenCLLibrary.clSetPrintfCallback_arg1_callback> arg1, Pointer<?> voidPtr1);

    /// Original signature : <code>cl_int clSetUserEventStatus(cl_event, cl_int)</code>
    @Optional
    int clSetUserEventStatus(@Ptr long cl_event1, int cl_int1);

    /// Original signature : <code>cl_int clUnloadCompiler()</code>
    int clUnloadCompiler();

    /// Original signature : <code>cl_int clUnloadPlatformCompiler(cl_platform_id)</code>
    @Optional
    int clUnloadPlatformCompiler(@Ptr long cl_platform_id1);

    /**
     * Event Object APIs<br>
     * Original signature : <code>cl_int clWaitForEvents(cl_uint, const cl_event*)</code>
     */
    int clWaitForEvents(int cl_uint1, @Ptr long cl_eventPtr1);
    
    public static class cl_device_id extends TypedPointer {

        public cl_device_id(long address) {
            super(address);
        }

        public cl_device_id(Pointer address) {
            super(address);
        }
    };

    public static class cl_mem extends TypedPointer {

        public cl_mem(long address) {
            super(address);
        }

        public cl_mem(Pointer address) {
            super(address);
        }
    };

    public static class cl_GLsync extends TypedPointer {

        public cl_GLsync(long address) {
            super(address);
        }

        public cl_GLsync(Pointer address) {
            super(address);
        }
    };

    public static class cl_event extends TypedPointer {

        public cl_event(long address) {
            super(address);
        }

        public cl_event(Pointer address) {
            super(address);
        }
    };

    public static class cl_platform_id extends TypedPointer {

        public cl_platform_id(long address) {
            super(address);
        }

        public cl_platform_id(Pointer address) {
            super(address);
        }
    };

    public static class cl_command_queue extends TypedPointer {

        public cl_command_queue(long address) {
            super(address);
        }

        public cl_command_queue(Pointer address) {
            super(address);
        }
    };

    public static class cl_context extends TypedPointer {

        public cl_context(long address) {
            super(address);
        }

        public cl_context(Pointer address) {
            super(address);
        }
    };

    public static class cl_sampler extends TypedPointer {

        public cl_sampler(long address) {
            super(address);
        }

        public cl_sampler(Pointer address) {
            super(address);
        }
    };

    public static class cl_program extends TypedPointer {

        public cl_program(long address) {
            super(address);
        }

        public cl_program(Pointer address) {
            super(address);
        }
    };

    public static class cl_kernel extends TypedPointer {

        public cl_kernel(long address) {
            super(address);
        }

        public cl_kernel(Pointer address) {
            super(address);
        }
    };
}
